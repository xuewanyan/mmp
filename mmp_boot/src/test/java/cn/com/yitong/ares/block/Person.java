package cn.com.yitong.ares.block;

/**
 * 测试静态代码块
 */
public class Person {

    public static String aa ="88";

    static {
        aa = "44";
        System.out.println(aa);
    }

}
