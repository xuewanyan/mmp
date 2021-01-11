package cn.com.yitong.ares.A20200818;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

public class Myclient {
    private int size = 1024;
    private ByteBuffer byteBuffer;
    private SocketChannel socketChannel;

    public void connectServer() throws IOException {
        socketChannel = socketChannel.open();
        socketChannel.connect(new InetSocketAddress("10.2.189.172",9000));
        socketChannel.configureBlocking(false);
        byteBuffer = ByteBuffer.allocate(size);
        receive();
    }

    private void receive() throws IOException {
        while (true){
            byteBuffer.clear();
            int count;
            //如果没有数据，则read方法一直阻塞，直到读取到新的数据
            while ((count = socketChannel.read(byteBuffer)) > 0){
                byteBuffer.flip();
                while (byteBuffer.hasRemaining()){
                    System.out.println((char)byteBuffer.get());
                }
                send2Server("<head></head>".getBytes());
                byteBuffer.clear();
            }
        }
    }

    private void send2Server(byte[] bytes) throws IOException {
        byteBuffer.clear();
        byteBuffer.put(bytes);
        byteBuffer.flip();
        socketChannel.write(byteBuffer);
    }
    public static void main(String[] args){
        try {
            new Myclient().connectServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
