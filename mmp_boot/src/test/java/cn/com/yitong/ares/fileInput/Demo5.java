package cn.com.yitong.ares.fileInput;

import java.io.*;

/** 字符流的转换 */
public class Demo5 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:" + File.separator + "hello" + File.separator + "my.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        OutputStream outputStream = new FileOutputStream(file);
        Writer writer = new OutputStreamWriter(outputStream);
        String ss = "你好啊，Word!xxxxxx";
        writer.write(ss);
        writer.close();
        outputStream.close();

        // inputStreamReader
        InputStream inputStream = new FileInputStream(file);
        Reader reader = new InputStreamReader(inputStream);
        char[] chars = new char[1024];
        reader.read(chars);
        System.out.println(new String(chars));
    }
}
