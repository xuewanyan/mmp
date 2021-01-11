package cn.com.yitong.ares.innerClass;

/**
 * 非内部类用法
 */
public class Outer2 {
    private String info = "测试内部类2";

    public void fun(){
        Inner2 inner = new Inner2(this);
        inner.print();
    }

    public String getInfo(){
        return this.info;
    }

    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        outer.fun();
    }

}

class Inner2{

    private Outer2 outer2;

    public Inner2(Outer2 outer2){
        this.outer2 = outer2;
    }

    public void print(){
        System.out.println(this.outer2.getInfo());
    }
}