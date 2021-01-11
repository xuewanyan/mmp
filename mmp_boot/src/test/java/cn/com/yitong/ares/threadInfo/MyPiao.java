package cn.com.yitong.ares.threadInfo;

/** 卖票，继承Thread */
public class MyPiao extends Thread {
  // 总共5张票
  private int liang = 5;

  @Override
  public void run() {
    this.send();
  }

  private synchronized void send() {
    for (int x = 0; x < 50; x--) {
      if (this.liang > 0) {
        System.out.println("剩余票数：=" + this.liang--);
      }
    }
  }
}

class Demo3 {
  public static void main(String[] args) {
    // 只有启动一个线程，会报错线程已经启动，只能实例化3个对象 才能启动3个线程
    MyPiao myPiao1 = new MyPiao();
    MyPiao myPiao2 = new MyPiao();
    MyPiao myPiao3 = new MyPiao();
    myPiao1.start();
    myPiao2.start();
    myPiao3.start();
  }
}
