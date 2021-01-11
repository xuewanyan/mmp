package cn.com.yitong.ares.A20200818;

import org.apache.commons.collections4.ListUtils;

import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class MyServer {
    private int size = 1024;
    private ServerSocketChannel serverSocketChannel;
    private ByteBuffer byteBuffer;
    private Selector selector;
    private int remoteClientNum = 0;
    public MyServer(int port){
        try {
            initChannel(port);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }
    //channel初始化
    private void initChannel(int port) throws Exception{
        //打开channel
        serverSocketChannel = ServerSocketChannel.open();
        //设置为非阻塞模式
        serverSocketChannel.configureBlocking(false);
        //绑定端口
        serverSocketChannel.bind(new InetSocketAddress(port));
        System.out.println("port is :" + port);
        //选择器的创建
        selector = Selector.open();
        //向选择器注入通道
        serverSocketChannel.register(selector, SelectionKey.OP_ACCEPT);
        //分配缓冲区的大小
        byteBuffer = ByteBuffer.allocate(size);
    }
    //监听器，用于监听channel上的数据变化
    private void listrner() throws Exception{
        while(true){
            //返回的int值表示有多个channel处于就绪状态
            int n = selector.select();
            if(n == 0){
                continue;
            }
            //每个selector 对应多个selectionKey，每个selectionKey对应一个channel
            Iterator<SelectionKey> iterable = selector.selectedKeys().iterator();
            while (iterable.hasNext()){
                SelectionKey key = iterable.next();
                //如果selectionKey处于就绪状态，则开始接收客户端的链接
                if(key.isAcceptable()){
                    //获取channel
                    ServerSocketChannel server = (ServerSocketChannel) key.channel();
                    //channel接收链接
                    SocketChannel channel = server.accept();
                    //channel注册
                    registerChannel(selector,channel,SelectionKey.OP_READ);
                    //远程客户端的链接数
                    remoteClientNum++;
                    System.out.println("online client num = " + remoteClientNum);
                    write(channel,"hello world".getBytes());
                }
                //如果通道已经处于就绪状态
                if(key.isReadable()){
                    read(key);
                }
                iterable.remove();
            }
        }

    }

    private void read(SelectionKey key) throws Exception{
        SocketChannel socketChannel = (SocketChannel) key.channel();
        int count;
        byteBuffer.clear();
        //从通道中读取数据到缓冲区
        while ((count = socketChannel.read(byteBuffer)) >0){
            //byteBuffer写模式变为读模式
            byteBuffer.flip();
            StringBuffer stringBuffer = new StringBuffer();
            boolean firstLine = true;
            while(byteBuffer.hasRemaining()){
                if(firstLine){
                    firstLine = false;
                }else {
//                    stringBuffer.append("\n");
                }
                stringBuffer.append((char)byteBuffer.get());
                System.out.println("+++++++" + stringBuffer.toString());
            };
            System.out.println("+++++++" + stringBuffer.toString());
            byteBuffer.clear();
        }
        if(count < 0 ){
            socketChannel.close();
        }
    }

    private void write(SocketChannel channel, byte[] bytes) throws Exception{
        byteBuffer.clear();
        byteBuffer.put(bytes);
        byteBuffer.flip();
        //将缓冲区的数据写入通道中
        channel.write(byteBuffer);
    }

    private void registerChannel(Selector selector, SocketChannel channel, int opRead) throws Exception{

        if(channel == null){
            return;
        }
        channel.configureBlocking(false);
        channel.register(selector,opRead);
    }
    public static void main(String[] args){
        MyServer server = new MyServer(9000);
        try {
            server.listrner();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
