package cn.com.yitong.ares.charInfo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/** 列出本机的全部属性 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        System.getProperties().list(System.out); // file.encoding=UTF-8

        OutputStream outputStream =
                new FileOutputStream(
                        new File("D:" + File.separator + "hello" + File.separator + "my.txt"));
        String str = "测试编码";
        outputStream.write(str.getBytes());
        outputStream.close();
    }
}
