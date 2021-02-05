package cn.com.yitong.ares.liuInfo;

import java.io.*;

/** 文件合并 */
public class Demo2 {
    public static void main(String[] args) throws Exception {

        // 读取文件 合并到new.txt中
        String t1 = "my.txt";
        String t2 = "you.txt";
        String t3 = "new.txt";
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        OutputStream outputStream =
                new FileOutputStream(
                        new File("D:" + File.separator + "hello" + File.separator + t3));
        InputStream inputStream =
                new FileInputStream(
                        new File("D:" + File.separator + "hello" + File.separator + t1));
        int len = 0;
        while ((len = inputStream.read()) != -1) {
            byteArrayOutputStream.write(len);
        }
        inputStream.close();

        InputStream inputStream1 =
                new FileInputStream(
                        new File("D:" + File.separator + "hello" + File.separator + t2));
        int len1 = 0;
        while ((len1 = inputStream1.read()) != -1) {
            byteArrayOutputStream.write(len1);
        }
        inputStream1.close();

        outputStream.write(byteArrayOutputStream.toByteArray());
        outputStream.close();
        byteArrayOutputStream.close();
    }
}
