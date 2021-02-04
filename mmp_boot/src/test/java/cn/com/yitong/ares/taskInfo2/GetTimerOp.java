package cn.com.yitong.ares.taskInfo2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

/** 定时任务 */
public class GetTimerOp extends TimerTask {

    private Product product;

    public GetTimerOp(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(
                "定时任务开始："
                        + Thread.currentThread().getName()
                        + ",时间"
                        + simpleDateFormat.format(new Date()));
        // 进行一系列操作
        product.setFlag();
    }
}
