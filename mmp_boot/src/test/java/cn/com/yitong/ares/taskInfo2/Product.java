package cn.com.yitong.ares.taskInfo2;

import java.text.SimpleDateFormat;
import java.util.Date;

/** 定时标识任务获取 */
public class Product {
    public String flag = "1";

    /**
     * 获取falg 来发定时任务
     *
     * @return
     */
    public synchronized void getFlag() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("getFlag:" + this.flag + "," + simpleDateFormat.format(new Date()));
        if ("0".equals(this.flag)) { // 表示已经有线程获取了该标识
            try {
                System.out.println(Thread.currentThread().getName() + "线程等待");
                super.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.flag = "0";
        System.out.println(Thread.currentThread().getName() + "标识改变完成");
    }

    /** 设置flag */
    public synchronized void setFlag() {
        System.out.println("setFlag:" + this.flag);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.flag = "1";
        //        super.notifyAll();
    }
}
