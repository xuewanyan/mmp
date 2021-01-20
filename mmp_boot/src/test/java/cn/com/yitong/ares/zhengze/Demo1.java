package cn.com.yitong.ares.zhengze;

/** 正则 */
public class Demo1 {
    public static void main(String[] args) {
        String ss = "1111";
        System.out.println(rep(ss));
        System.out.println(ss.matches("\\d+"));
        System.out.println(ss.matches("\\d{2,4}")); // 匹配1-2位
        System.out.println(ss.matches("a"));
    }

    public static boolean rep(String str) {

        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
