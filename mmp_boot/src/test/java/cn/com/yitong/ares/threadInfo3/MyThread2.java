package cn.com.yitong.ares.threadInfo3;

/** 死锁示范 */
public class MyThread2 implements Runnable {
  @Override
  public void run() {}
}

class QiangDao {
  public synchronized void say(FuRen fuRen) {
    System.out.println("强盗1说");
    System.out.println("666");
    fuRen.get();
  }

  public synchronized void get() {
    System.out.println("返回强盗");
    System.out.println("444");
  }
}

class FuRen {
  public synchronized void say(QiangDao qiangDao) {
    System.out.println("富人2说");
    System.out.println("333");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    qiangDao.get();
  }

  public synchronized void get() {
    System.out.println("返回富人");
    System.out.println("777");
  }
}

class Demo2 implements Runnable {
  private QiangDao qiangDao = new QiangDao();
  private FuRen fuRen = new FuRen();

  public Demo2() {
    System.out.println("111");
    new Thread(this).start();
    System.out.println("222");
    fuRen.say(qiangDao);
  }

  public static void main(String[] args) {
    new Demo2();
  }

  @Override
  public void run() {
    System.out.println("555");
    qiangDao.say(fuRen);
  }
}
