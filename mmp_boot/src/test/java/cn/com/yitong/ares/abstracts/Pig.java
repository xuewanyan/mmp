package cn.com.yitong.ares.abstracts;

public class Pig extends Action{
    @Override
    public void work() {

    }

    @Override
    public void eat() {
        System.out.println("猪在吃");
    }

    @Override
    public void sleep() {
        System.out.println("猪在睡觉");
    }
}
