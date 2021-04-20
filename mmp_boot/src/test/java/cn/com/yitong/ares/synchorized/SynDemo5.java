package cn.com.yitong.ares.synchorized;

import lombok.SneakyThrows;

/** 对象锁 */
public class SynDemo5 implements Runnable {
    static SynDemo5 synDemo1 = new SynDemo5();
    static SynDemo5 synDemo2 = new SynDemo5();

    @SneakyThrows
    @Override
    public void run() {
        synchronized (SynDemo5.class) {
            System.out.println("我是线程：" + Thread.currentThread().getName());
            Thread.sleep(3000);
            System.out.println("线程：" + Thread.currentThread().getName() + "结束");
        }
    }

    public static void main(String[] args) {
        Thread thread2 = new Thread(synDemo1);
        Thread thread3 = new Thread(synDemo2);
        thread2.start();
        thread3.start();
    }
}
