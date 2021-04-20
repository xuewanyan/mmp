package cn.com.yitong.ares.synchorized;

import lombok.SneakyThrows;

/** 对象锁 */
public class SynDemo3 implements Runnable {
    static SynDemo3 synDemo1 = new SynDemo3();

    @SneakyThrows
    @Override
    public void run() {
        method();
    }

    private synchronized void method() throws InterruptedException {
        System.out.println("我是线程：" + Thread.currentThread().getName());
        Thread.sleep(3000);
    }

    public static void main(String[] args) {
        Thread thread2 = new Thread(synDemo1);
        Thread thread3 = new Thread(synDemo1);
        thread2.start();
        thread3.start();
    }
}
