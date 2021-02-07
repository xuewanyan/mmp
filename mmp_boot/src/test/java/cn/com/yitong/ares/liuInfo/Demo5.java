package cn.com.yitong.ares.liuInfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/** 使用BufferedReader进行文件缓冲的读取 */
public class Demo5 {
    public static void main(String[] args) throws IOException {
        BufferedReader buf =
                new BufferedReader(
                        new FileReader(
                                new File(
                                        "D:"
                                                + File.separator
                                                + "hello"
                                                + File.separator
                                                + "my.txt")));
        String str = buf.readLine();
        System.out.println(str);
    }
}
