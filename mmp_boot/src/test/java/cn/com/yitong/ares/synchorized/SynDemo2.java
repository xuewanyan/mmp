package cn.com.yitong.ares.synchorized;

import lombok.SneakyThrows;

/** 对象锁 */
public class SynDemo2 implements Runnable {
    static SynDemo2 synDemo1 = new SynDemo2();

    Object object1 = new Object();
    Object object2 = new Object();

    @SneakyThrows
    @Override
    public void run() {
        // 使用第一把锁
        synchronized (object1) {
            Thread.sleep(1000);

            System.out.println("object1:" + Thread.currentThread().getName() + "结束");
        }
        // 使用第一把锁
        synchronized (object2) {
            Thread.sleep(1000);

            System.out.println("object2:" + Thread.currentThread().getName() + "结束");
        }
    }

    public static void main(String[] args) {
        Thread thread2 = new Thread(synDemo1);
        Thread thread3 = new Thread(synDemo1);
        thread2.start();
        thread3.start();
    }
}
