package cn.com.yitong.ares.quote;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class Demo11 {
    private int num = 10;

    public Demo11(int num) {
        this.num = num;
    }
}

class Demo22 {
    private String msg = "hello";

    public Demo22(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Demo11 demo = new Demo11(100);
        fun(demo);
        System.out.println(demo.getNum());

        String str = "hello";
        fun1(str);
        System.out.println(str);

        Demo22 demo22 = new Demo22("world");
        fun2(demo22);
        System.out.println(demo22.getMsg());
    }

    public static void fun(Demo11 demo) {
        demo.setNum(20);
    }

    public static void fun1(String temp) {
        temp = "world";
    }

    public static void fun2(Demo22 temp) {
        temp.setMsg("MDNL");
    }
}
