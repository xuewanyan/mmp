package cn.com.yitong.ares.threadInfo2;

/** 休眠线程 */
public class MyThread3 implements Runnable {
  @Override
  public void run() {
    for (int x = 0; x < 20; x++) {
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("name: = " + Thread.currentThread().getName() + ",x = " + x);
    }
  }
}

class Demo3 {
  public static void main(String[] args) throws Exception {
    //
    MyThread3 mt = new MyThread3();
    //    new Thread(runnable, "线程1").start();
    //    new Thread(runnable, "线程2").start();
    //    new Thread(runnable, "线程3").start();

    // 测试线程中断
    Thread t = new Thread(mt, "线程4");
    t.start();
    Thread.sleep(2000);
    t.interrupted(); // 中断线程
  }
}
