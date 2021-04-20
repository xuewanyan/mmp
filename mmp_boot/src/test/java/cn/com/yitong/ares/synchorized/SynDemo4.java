package cn.com.yitong.ares.synchorized;

import lombok.SneakyThrows;

/** 对象锁 */
public class SynDemo4 implements Runnable {
    static SynDemo4 synDemo1 = new SynDemo4();
    static SynDemo4 synDemo2 = new SynDemo4();

    @SneakyThrows
    @Override
    public void run() {
        method();
    }

    // synchroized作用在静态方法上，这个时候的默认锁就是当前的Class类，所以无论哪个程序访问它，需要的锁都只有一把
    private static synchronized void method() throws InterruptedException {
        System.out.println("我是线程：" + Thread.currentThread().getName());
        Thread.sleep(3000);
        System.out.println("线程：" + Thread.currentThread().getName() + "结束");
    }

    public static void main(String[] args) {
        Thread thread2 = new Thread(synDemo1);
        Thread thread3 = new Thread(synDemo2);
        thread2.start();
        thread3.start();
    }
}
