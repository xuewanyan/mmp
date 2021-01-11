package cn.com.yitong.ares.threadInfo2;

/** 取得线程名称 */
public class MyThread1 implements Runnable {
  @Override
  public void run() {
    for (int x = 0; x < 10; x++) {
      System.out.println("name = " + Thread.currentThread().getName() + ",x" + x);
    }
  }
}

class Demo1 {
  public static void main(String[] args) {
    //
    Runnable runnable = new MyThread1();
    new Thread(runnable, "线程A").start();
    new Thread(runnable).start();
    new Thread(runnable).start();
  }
}
