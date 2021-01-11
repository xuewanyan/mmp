package cn.com.yitong.ares.threadInfo;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/** callable 接口实现 */
public class MyTread3 implements Callable<String> {

  // 总共5张票
  private int liang = 5;

  @Override
  public String call() throws Exception {
    this.send();
    return "没了哇大额";
  }

  private synchronized void send() {
    for (int x = 0; x < 50; x--) {
      if (this.liang > 0) {
        System.out.println("剩余票数：=" + this.liang--);
      }
    }
  }
}

class Demo5 {
  public static void main(String[] args) throws ExecutionException, InterruptedException {
    //
    Callable<String> callable = new MyTread3();
    FutureTask<String> futureTask = new FutureTask<>(callable);
    Thread thread = new Thread(futureTask);
    thread.start();
    System.out.println(futureTask.get());
  }
}
