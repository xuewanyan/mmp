package cn.com.yitong.ares.fileInfo;

import java.io.File;
import java.io.IOException;

/** File类 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:" + File.separator + "hello1" + File.separator + "text.txt");
        if (!file.getParentFile().exists()) { // 先判断父级目录是否存在
            file.getParentFile().mkdirs();
        }
        if (!file.exists()) {
            file.createNewFile();
        }
    }
}
