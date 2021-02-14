package cn.com.yitong.ares.wangluo;

import java.net.Socket;
import java.util.Scanner;

/** 客户端 Socket */
public class Demo2 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 9999);
        Scanner scanner = new Scanner(socket.getInputStream());
        scanner.useDelimiter("\n");
        if (scanner.hasNext()) {
            System.out.println("输出服务的的数据：" + scanner.next());
        }
        scanner.close();
        socket.close();
    }
}
