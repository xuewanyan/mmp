package cn.com.yitong.ares.liuInfo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/** 内存操作流 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        String str = "Hello World! XueYan";
        InputStream inputStream = new ByteArrayInputStream(str.getBytes());
        OutputStream outputStream = new ByteArrayOutputStream();
        // 进行读写操作
        int len = 0;
        while ((len = inputStream.read()) != -1) {
            outputStream.write(Character.toLowerCase(len));
        }
        System.out.println(outputStream);
    }
}
