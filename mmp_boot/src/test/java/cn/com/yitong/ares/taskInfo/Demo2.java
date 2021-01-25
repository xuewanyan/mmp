package cn.com.yitong.ares.taskInfo;

import java.util.Timer;
import java.util.TimerTask;

/** 定时调度 */
class MyTask extends TimerTask {

    private int i = 0;

    @Override
    public void run() {
        System.out.println(i++);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new MyTask(), 1000, 3000);
    }
}
