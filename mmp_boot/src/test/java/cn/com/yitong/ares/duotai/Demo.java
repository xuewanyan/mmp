package cn.com.yitong.ares.duotai;

public class Demo {

    public void getMsg() {}
}

class InnerNoStatic {
    private static class InnerClass {
        /*
        下面三个静态声明都将引发如下编译错误:
        非静态内部类不能有静态声明
        */
        {
            System.out.println("=cccccccc==");
        }

        static {
            System.out.println("==========");
        }

        private static int inProp;

        private static void test() {}
        ;
    }

    public static void main(String[] args) {
        InnerClass inner = new InnerClass();
        InnerClass.inProp = 100;
        InnerClass.test();
    }
}
