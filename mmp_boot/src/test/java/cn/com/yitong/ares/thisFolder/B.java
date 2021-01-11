package cn.com.yitong.ares.thisFolder;

public class B {

    private A a;
    public B(A a){//此时a代表this 也是x
        this.a = a;//a对象于x对象 指向同一个堆内存
    }
    public void get(){
        this.a.print();//this.x.print()
    }
}
