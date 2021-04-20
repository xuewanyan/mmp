package cn.com.yitong.ares.synchorized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** 对象锁 */
public class SynDemo10 {

    Lock lock = new ReentrantLock();

    public synchronized void method1() {
        System.out.println("synchroized methoid1");
    }

    public void method2() {
        lock.lock();
        try {
            System.out.println("lock method2");
        } finally {
            lock.unlock();
        }
    }
}
