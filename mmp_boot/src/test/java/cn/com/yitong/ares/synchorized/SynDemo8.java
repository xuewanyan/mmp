package cn.com.yitong.ares.synchorized;

/** 对象锁 */
public class SynDemo8 {

    int a = 0;

    public static void main(String[] args) {
        new SynDemo8().method();
        new SynDemo8().method();
    }

    public synchronized void method() {
        System.out.println("method1");
        method2();
    }

    private synchronized void method2() {
        System.out.println("method2");
    }
}
