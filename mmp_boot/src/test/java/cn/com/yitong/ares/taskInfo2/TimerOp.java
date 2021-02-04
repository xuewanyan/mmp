package cn.com.yitong.ares.taskInfo2;

import java.util.Timer;

/** 定时任务调度 */
public class TimerOp {

    public void startOp(Product product) {
        Timer timer = new Timer();
        timer.schedule(new GetTimerOp(product), 1000, 9000);
    }
}
