package cn.com.yitong.ares.abstracts;

public class Demo {

    public static void main(String[] args) {
        fun(new Person());
    }

    public static void fun(Action action){
        action.sleep();
        action.eat();
        action.work();
    }
}
