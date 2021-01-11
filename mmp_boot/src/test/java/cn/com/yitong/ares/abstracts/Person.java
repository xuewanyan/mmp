package cn.com.yitong.ares.abstracts;

public class Person extends Action{
    @Override
    public void work() {
        System.out.println("人再工作");
    }

    @Override
    public void eat() {
        System.out.println("人再吃");
    }

    @Override
    public void sleep() {
        System.out.println("人在睡觉");
    }
}
