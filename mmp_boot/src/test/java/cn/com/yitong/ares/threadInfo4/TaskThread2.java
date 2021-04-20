package cn.com.yitong.ares.threadInfo4;

import lombok.SneakyThrows;

public class TaskThread2 implements Runnable {

    private TaskThread taskThread;
    Taskid taskid1 = new Taskid();

    public TaskThread2(TaskThread taskThread) {
        this.taskThread = taskThread;
    }

    @SneakyThrows
    @Override
    public void run() {
        String a2 = "YX111113";
        taskid1.setTaskod(a2);
        taskThread.update(taskid1);
    }
}

class TaskThread3 implements Runnable {
    Taskid taskid2 = new Taskid();
    private TaskThread taskThread;

    public TaskThread3(TaskThread taskThread) {
        this.taskThread = taskThread;
    }

    @SneakyThrows
    @Override
    public void run() {
        String a3 = "YX111113";
        taskid2.setTaskod(a3);
        taskThread.update(taskid2);
    }
}
