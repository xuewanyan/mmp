package cn.com.yitong.ares.fileInfo;

import java.io.File;

/** File文件的特殊操作 */
public class Demo2 {
    public static void main(String[] args) {
        File file = new File("D:" + File.separator + "my.jpg");
        if (file.exists()) {
            System.out.println("判断是否为目录：" + file.isDirectory());
            System.out.println("判断是否为文件：" + file.isFile());
            System.out.println("文件大小：" + file.length() / 1024);
        }
    }
}
