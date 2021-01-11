package cn.com.yitong.ares.innerClass;

/**
 * 内部类
 */
public class Outer {
    private String info = "测试内部类";


    class Inner{
        private String msg = "外部调用";
        public void print(){
            System.out.println(Outer.this.info);
        }
    }
    public void fun(){
        Inner inner = new Inner();
        inner.print();
        System.out.println(inner.msg);
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.fun();
        System.out.println(outer.info);
    }
}
