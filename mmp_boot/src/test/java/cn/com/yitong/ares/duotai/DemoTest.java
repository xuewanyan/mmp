package cn.com.yitong.ares.duotai;

public class DemoTest {

    public static void main(String[] args) {
//        fun(new A());
//        fun(new B());
//        fun(new C());

//        A a = new B();
//        a.print();
//        B b = (B) a;
//        b.funB();

        A a = new A();
        A b = new B();
        A c = new C();
        fun(a);
        fun(b);
        fun(c);
//        System.out.println(a instanceof A);
//        System.out.println(a instanceof B);

    }

    public static void fun(A A){
        A.print();
    }
//    public static void fun(B B){
//        B.print();
//    }
//    public static void fun(C C){
//        C.print();
//    }
}
