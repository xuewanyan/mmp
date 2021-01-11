package cn.com.yitong.ares.extendsInfo;

public class B extends A{
    public B(){

    }
    public B(String name){
        this();
        System.out.println("BBBBBBBBBBBBBB");
    }

    public static void main(String[] args) {
        String name = "11";
        B b = new B(name);

    }

}
