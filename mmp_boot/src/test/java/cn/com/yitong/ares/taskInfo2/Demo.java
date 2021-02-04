package cn.com.yitong.ares.taskInfo2;

public class Demo {

    public static void main(String[] args) {
        Product product = new Product();
        Thread thread1 = new Thread(new RunnableOp(product), "Time1");
        Thread thread2 = new Thread(new RunnableOp(product), "Time2");
        Thread thread3 = new Thread(new RunnableOp(product), "Time3");
        Thread thread4 = new Thread(new RunnableOp(product), "Time4");
        Thread thread5 = new Thread(new RunnableOp(product), "Time5");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
