package cn.com.yitong.ares.innerClass;

/**
 * 你们内部类
 */
public class A implements B{
    @Override
    public void print() {
        System.out.println("AAAAAAAAAAAAAAAAA");
    }

//    public static void main(String[] args) {
//        B b = new A();
//        b.print();
//    }
}

class TestDemo{

    Integer integer;
    int a;

    public static void main(String[] args) {
        B b = new B() {
            @Override
            public void print() {
                System.out.println("aAAAA");
            }
        };
        b.print();
    }

}

interface B{
    public void print();
}