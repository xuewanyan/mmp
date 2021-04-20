package cn.com.yitong.ares.synchorized;

import lombok.SneakyThrows;

/** 对象锁 */
public class SynDemo1 implements Runnable {
    static SynDemo1 synDemo1 = new SynDemo1();

    @SneakyThrows
    @Override
    public void run() {
        // 同步代码块形式——锁为this,两个线程使用的锁是一样的,线程1必须要等到线程0释放了该锁后，才能执行
        System.out.println(this);
        synchronized (this) {
            Thread.sleep(3000);

            System.out.println(Thread.currentThread().getName() + "结束");
        }
    }

    public static void main(String[] args) {
        Thread thread2 = new Thread(synDemo1);
        Thread thread3 = new Thread(synDemo1);
        thread2.start();
        thread3.start();
    }
}
