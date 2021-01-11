package cn.com.yitong.ares.threadInfo2;

public class MyThread2 implements Runnable {
  @Override
  public void run() {
    System.out.println("name = " + Thread.currentThread().getName());
  }
}

class Demo2 {
  public static void main(String[] args) {
    //
    Runnable runnable = new MyThread2();
    new Thread(runnable).start();

    runnable.run();
  }
}
