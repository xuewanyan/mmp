package cn.com.yitong.ares.fileInput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/** Writer */
public class Demo3 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:" + File.separator + "hello" + File.separator + "my.txt");
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

        // 使用Writer子类进行 实例化
        String str = "这是一个测试writer";
        Writer writer = new FileWriter(file, true); // 如果带上true标识追加
        writer.write(str);
        writer.close();
    }
}
