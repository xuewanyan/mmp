package cn.com.yitong.ares.fileInput;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/** 实现文件的输出 */
public class Demo1 {
    public static void main(String[] args) throws IOException {

        // 定义要输出文件的file类对象
        File file = new File("D:" + File.separator + "hello" + File.separator + "my.txt");

        // 输出信息的时候，文件可以不存在，但是目录一定要存在
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }
        // 利用OutputStream的子类为父类进行实例化
        OutputStream outputStream = new FileOutputStream(file, true);
        // 输出蚊子信息
        String msg = "立冬是2020年11月7号" + "\r\n"; // 字符串
        // 为了方便输出，需要转换为字节数组
        byte[] bytes = msg.getBytes();
        //        outputStream.write(bytes);
        //        outputStream.close();

        // 输出部分内容 2个字节 = 1个字符
        outputStream.write(bytes, 0, 10);
        outputStream.close();

        // 或者还可以使用循环的形式单个字节进行输出
        //        for (int i = 0; i < bytes.length; i++) {
        //            outputStream.write(bytes[i]);
        //        }
        //        outputStream.close();

        // File的追究操作
    }
}
