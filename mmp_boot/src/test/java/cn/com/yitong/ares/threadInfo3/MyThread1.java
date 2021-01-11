package cn.com.yitong.ares.threadInfo3;

public class MyThread1 implements Runnable {
  private int co = 500;

  @Override
  public void run() {
    for (int x = 0; x < 1000; x++) {
      this.fun();
    }
  }

  public synchronized void fun() {
    if (this.co > 0) {
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println(Thread.currentThread().getName() + ",co剩余：" + this.co--);
    }
  }
}

class Demo {
  public static void main(String[] args) {
    //
    MyThread1 myThread1 = new MyThread1();
    Thread threada = new Thread(myThread1, "黄牛A");
    Thread threadb = new Thread(myThread1, "黄牛B");
    Thread threadc = new Thread(myThread1, "黄牛C");
    threada.start();
    threadb.start();
    threadc.start();
  }
}
