package cn.com.yitong.ares.fileInput;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/** Reader */
public class Demo4 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:" + File.separator + "hello" + File.separator + "my.txt");
        if (file.exists()) {
            Reader reader = new FileReader(file);
            int len = 0;
            char[] chars = new char[1024];
            len = reader.read(chars);
            System.out.println(new String(chars, 0, len));
        }
    }
}
