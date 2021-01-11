package cn.com.yitong.ares.thisFolder;

public class A {

    public A(){
        B b = new B(this);//实例化B对象。此时this出现在A类，所以代表A类当前对象
        b.get();//对象名为b的引用调用b中get()方法
    }

    public void print(){//最终调用这个方法
        System.out.println("Hello World");
    }
}
