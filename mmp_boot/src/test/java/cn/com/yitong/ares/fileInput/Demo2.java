package cn.com.yitong.ares.fileInput;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/** 文件的读取 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:" + File.separator + "hello" + File.separator + "my.txt");

        // 通过子类 实例化IutputStream对象
        InputStream inputStream = new FileInputStream(file);

        // 准备一个数组容器 读取字节
        byte[] bytes = new byte[1024];

        int len = 0;
        int root = 0;
        while ((len = inputStream.read()) != -1) {
            bytes[root++] = (byte) len;
        }
        System.out.println(new String(bytes, 0, root));
        // 关闭输入流
        inputStream.close();
    }
}
