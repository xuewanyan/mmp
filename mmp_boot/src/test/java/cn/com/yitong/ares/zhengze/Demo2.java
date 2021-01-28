package cn.com.yitong.ares.zhengze;

/** 正则表达式 */
public class Demo2 {
    public static void main(String[] args) {
        String str = "13sd";
        boolean b = str.matches("\\d{7,8}"); // 验证7-8位数字

        String str1 = "0523-83680519";
        boolean b1 = str1.matches("(\\d{3,4}-)\\d{7,8}"); // 电话格式

        String str2 = "(010)-83680519";
        boolean b2 = str2.matches("((\\d{3,4}-)|(\\(\\d{3,4}\\)-))\\d{7,8}"); // 电话格式

        // 验证邮箱
        String str3 = "532960400@qq.com";
        boolean b3 = str3.matches("\\w+@\\w+\\.\\w+");

        // 完整验证邮箱：在email中的用户名可以由字母、数字、-、下划线、.组成，长度6-30位，其中要求以字母开头，
        // 同时在域名的后缀只能够是：.com .cn.com.cn .net .net.cn .gov .edu .org .me等
        String str4 = "xy-x.y_2021@mis.cn.com";
        boolean b4 =
                str4.matches(
                        "[a-zA-Z][a-zA-Z0-9_\\-\\.]{5,29}@[a-zA-Z0-9_\\-\\.]+\\.(com|cn\\.com|net|net\\.cn|gov|edu|org|me)");

        // 手机号码正则 可以能以为 137 138 135 133 开头
        String str5 = "13775712222";
        boolean b5 = str5.matches("(137|138|135|133)\\d{8}");

        String str6 = "AAD/AA/AA/DSDA/";
        boolean b6 = str6.matches("[A-Z]+/[A-Z]+/");

        // 验证邮编 数字5-6位 不为000000
        String str7 = "123450";
        boolean b7 = str7.matches("[1-9]\\d{5}?");

        // 验证 esb . three esb.two
        String str8 = "three.esb";
        boolean b8 = str8.matches("esb\\.three");
        System.out.println(b8);
    }
}
