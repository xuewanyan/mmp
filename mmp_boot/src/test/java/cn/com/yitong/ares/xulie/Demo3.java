package cn.com.yitong.ares.xulie;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/** 实现国际化 */
public class Demo3 {
    public static void main(String[] args) {
        Locale locale = new Locale("zh", "CN"); // 读取中文资源文件
        ResourceBundle resourceBundle = ResourceBundle.getBundle("xxxx", locale);
        String str = resourceBundle.getString("key"); // 具有一个占位符{0}代表一个占位符

        System.out.println(MessageFormat.format(str, "补充占位符"));
    }
}
