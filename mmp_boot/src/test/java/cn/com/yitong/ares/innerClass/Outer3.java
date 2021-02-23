package cn.com.yitong.ares.innerClass;

/** 调用 其他类的 内部类 */
public class Outer3 {

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.print();

        int a = 0;
        Integer aa = new Integer(a);
        System.out.println(aa);
    }
}
