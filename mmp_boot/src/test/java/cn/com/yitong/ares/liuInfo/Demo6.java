package cn.com.yitong.ares.liuInfo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/** Sccanner */
public class Demo6 {
    public static void main(String[] args) throws IOException {
        Scanner scanner =
                new Scanner(
                        new FileInputStream(
                                new File(
                                        "D:"
                                                + File.separator
                                                + "my-file"
                                                + File.separator
                                                + "网址集合.txt")));

        scanner.useDelimiter("\n");
        while (scanner.hasNext()) { // 循环  while
            System.out.println(scanner.next());
        }
    }
}
