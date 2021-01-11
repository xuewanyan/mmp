package cn.com.yitong.ares.quote;

import cn.com.yitong.ares.A20200617.D;

class Demo{
    private String msg = "UU";
    public Demo(String msg){
        this.msg = msg;
    }
    public void setMsg(String msg){
        this.msg = msg;
    }
    public String getMsg(){
        return this.msg;
    }
}


public class TestDemo {
    public static void main(String[] args) {
        Demo demo = new Demo("WERF");
        fun(demo);
        System.out.println(demo.getMsg());
    }

    public static void fun(Demo temp){
        temp.setMsg("NNNNNN");
    }
}
