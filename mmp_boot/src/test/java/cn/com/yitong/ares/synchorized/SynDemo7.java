package cn.com.yitong.ares.synchorized;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/** 对象锁 */
public class SynDemo7 {

    int a = 0;

    public static void main(String[] args) {
        new SynDemo7().start();
    }

    //    public synchronized void method() {
    //        System.out.println("a==" + a);
    //        if (a == 0) {
    //            a++;
    //            method();
    //        }
    //    }

    public void start() {
        ThreadFactory guavaThreadFactory =
                new ThreadFactoryBuilder().setNameFormat("retryClient-pool-").build();

        ExecutorService exec =
                new ThreadPoolExecutor(
                        1,
                        1,
                        0L,
                        TimeUnit.MILLISECONDS,
                        new LinkedBlockingQueue<Runnable>(10),
                        guavaThreadFactory);
        exec.submit(
                () -> {
                    this.method();
                });
        exec.shutdown();
    }

    public void method() {
        System.out.println("111111111");
    }
}
