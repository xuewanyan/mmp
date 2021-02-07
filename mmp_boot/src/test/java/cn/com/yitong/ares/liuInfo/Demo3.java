package cn.com.yitong.ares.liuInfo;

import java.io.*;

/** 打印流设计思想 */
class PrintUtil {
    // 接收 String int double 可以换行

    private OutputStream out;

    public PrintUtil(OutputStream out) {
        this.out = out;
    }

    public void print(String str) throws IOException {
        this.out.write(str.getBytes());
    }

    public void print(int i) throws IOException {
        this.print(String.valueOf(i));
    }

    public void print(double d) throws IOException {
        this.print(String.valueOf(d));
    }

    public void println(String str) throws IOException {
        this.print(str + "\n");
    }

    public void println(int i) throws IOException {
        this.println(String.valueOf(i));
    }

    public void println(double d) throws IOException {
        this.println(String.valueOf(d));
    }
}

public class Demo3 {
    public static void main(String[] args) throws IOException {
        PrintStream printUtil =
                new PrintStream(
                        new FileOutputStream(
                                new File(
                                        "D:"
                                                + File.separator
                                                + "hello"
                                                + File.separator
                                                + "my.txt")));
        printUtil.println("我是超人吗");
        printUtil.print("我的工资是");
        printUtil.println(1.2);
        printUtil.print("我今年多大了");
        printUtil.print(29);

        // 正常情况下 都用PrintStream 就行了
    }
}
