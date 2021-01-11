package cn.com.yitong.ares.threadInfo;

/** 线程主体类 */
public class MyThread extends Thread { // 实现多线程

  private String name;

  public MyThread(String name) {
    this.name = name;
  }

  @Override
  public void run() { // 覆写run方法，线程启动的主方法
    for (int x = 0; x < 10; x++) {
      System.out.println(this.name + "," + x + "=====" + System.currentTimeMillis());
    }
  }
}

class Demo1 {
  public static void main(String[] args) {
    Thread myThread1 = new MyThread("线程1");
    Thread myThread2 = new MyThread("线程2");
    Thread myThread3 = new MyThread("线程3");
    Thread myThread4 = new MyThread("线程4");
    Thread myThread5 = new MyThread("线程5");
    myThread1.start();
    myThread2.start();
    myThread3.start();
    myThread4.start();
    myThread5.start();
  }
}
