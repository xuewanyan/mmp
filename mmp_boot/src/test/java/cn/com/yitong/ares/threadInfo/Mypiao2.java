package cn.com.yitong.ares.threadInfo;

/** 使用Runnable接口实现麦片 */
public class Mypiao2 implements Runnable {

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

class Demo4 {
  public static void main(String[] args) {
    //
    Mypiao2 mypiao2 = new Mypiao2();
    for (int i = 0; i < 3; i++) {
      new Thread(mypiao2).start();
    }
  }
}
