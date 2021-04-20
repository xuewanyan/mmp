package cn.com.yitong.ares.threadInfo4;

public class Demo {
    public static void main(String[] args) {
        Thread thread = new Thread(new TaskThread());
        Thread thread3 = new Thread(new TaskThread());
        Thread thread2 = new Thread(new TaskThread2(new TaskThread()));
        Thread thread4 = new Thread(new TaskThread3(new TaskThread()));
        thread.setName("a");
        thread3.setName("b");
        thread2.setName("c");
        thread4.setName("d");
        thread3.start();
        thread2.start();
        thread4.start();
        thread.start();
    }
}
