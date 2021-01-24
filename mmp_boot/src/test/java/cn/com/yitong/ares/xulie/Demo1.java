package cn.com.yitong.ares.xulie;

import java.util.Locale;

/** Loacl类 */
public class Demo1 {
    public static void main(String[] args) {
        Locale locale = new Locale("zh", "CN");
        System.out.println(locale);

        // Local 类提供一个获取当前环境的方法
        Locale locale1 = Locale.getDefault();
        System.out.println(locale1);
    }
}
