package cn.com.yitong.ares.threadInfo4;

import lombok.SneakyThrows;

public class TaskThread implements Runnable {
    Taskid taskid = new Taskid();

    public void update(Taskid id) throws InterruptedException {
        System.out.println(this);
        synchronized (this) {
            Thread.sleep(1000);
            deal(id);
        }
    }

    @SneakyThrows
    @Override
    public void run() {
        String a1 = "YX111111";
        taskid.setTaskod(a1);
        update(taskid);
    }

    public static void deal(Taskid id) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + "进行数据处理" + id);
    }
}
