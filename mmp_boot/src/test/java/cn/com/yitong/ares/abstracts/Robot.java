package cn.com.yitong.ares.abstracts;

public class Robot extends Action{
    @Override
    public void work() {
        System.out.println("机器人再工作");
    }

    @Override
    public void eat() {
        System.out.println("机器人再补充能量");
    }

    @Override
    public void sleep() {

    }
}
