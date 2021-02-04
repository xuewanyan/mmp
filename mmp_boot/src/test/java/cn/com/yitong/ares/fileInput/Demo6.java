package cn.com.yitong.ares.fileInput;

import java.io.*;

/** 文件拷贝 */
public class Demo6 {
    public static void main(String[] args) throws Exception {
        // 文件D:\hello\my.txt 拷贝到 D:\
        File file = new File("D:" + File.separator + "hello" + File.separator + "my.txt");

        File file1 = new File("D:" + File.separator + "myy.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        InputStream inputStream = new FileInputStream(file);
        OutputStream outputStream = new FileOutputStream(file1);
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
        inputStream.close();
        outputStream.close();
    }
}
