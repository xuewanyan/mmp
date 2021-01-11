package cn.com.yitong.ares.innerClass;

/**
 * 静态内部类
 */
public class OuterStatic {

    private static String info = "撒旦";

    static class Inner{

        public void pring(){
            System.out.println(info);
        }
    }
}

/**
 *
 */
class staticDema{
    public static void main(String[] args) {
        OuterStatic.Inner inner = new OuterStatic.Inner();
        inner.pring();
    }
}