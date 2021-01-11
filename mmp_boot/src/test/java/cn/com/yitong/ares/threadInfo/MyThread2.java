package cn.com.yitong.ares.threadInfo;

/** 实现Runnable接口 */
public class MyThread2 implements Runnable {

  private String name;

  public MyThread2(String name) {
    this.name = name;
  }

  @Override
  public void run() {
    for (int x = 0; x < 10; x++) {
      System.out.println(this.name + "," + x + "=====" + System.currentTimeMillis());
    }
  }
}

class Demo2 {
  public static void main(String[] args) {

    // 普通写法
    //    new Thread(
    //            new Runnable() {
    //              @Override
    //              public void run() {
    //                for (int x = 0; x < 10; x++) {
    //                  System.out.println("===as" + "," + x + "=====" +
    // System.currentTimeMillis());
    //                }
    //              }
    //            })
    //        .start();
    //    // 方法实现后写法
    //    new Thread(new MyThread2("线程2")).start();

    // 使用lamdba表达式
    new Thread(
            () -> {
              for (int x = 0; x < 10; x++) {
                System.out.println("===as" + "," + x + "=====" + System.currentTimeMillis());
              }
            })
        .start();
  }
}
