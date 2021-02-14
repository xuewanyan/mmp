package cn.com.yitong.ares.wangluo;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/** 编写一个服务器端ServerSocket */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999); // 表示在本机的9999端口监听
        System.out.println("等待客户端连接");
        Socket client = serverSocket.accept(); // 进入阻塞状态，等待
        PrintStream printStream = new PrintStream(client.getOutputStream());
        printStream.print("Hello World");
        printStream.close();
        serverSocket.close();
    }
}
