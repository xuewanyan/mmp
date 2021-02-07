package cn.com.yitong.ares.liuInfo;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/** 键盘输入打印输入流 */
public class Demo4 {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        ByteArrayOutputStream byo = new ByteArrayOutputStream();
        System.out.print("请输入信息:");
        int len = 0;
        while ((len = inputStream.read()) != -1) {
            if (len == '\n') {
                break;
            }
            byo.write(len);
        }
        System.out.println(new String(byo.toByteArray()));
    }
}
