package cn.com.yitong.ares.threadInfo2;

/** 线程优先级设置 */
public class MyThread4 implements Runnable {
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

class Demo4 {
  public static void main(String[] args) throws Exception {
    //
    MyThread4 mt = new MyThread4();
    Thread t1 = new Thread(mt, "线程A");
    Thread t2 = new Thread(mt, "线程B");
    Thread t3 = new Thread(mt, "线程C");
    t1.setPriority(Thread.MAX_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);
    t3.setPriority(Thread.NORM_PRIORITY);
    t1.start();
    t2.start();
    t3.start();

    System.out.println("主线程的优先级：" + Thread.currentThread().getPriority());
  }
}
