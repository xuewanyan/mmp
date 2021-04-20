package cn.com.yitong.ares.synchorized;

/** 对象锁 */
public class SynDemo6 {

    int a = 0;

    public static void main(String[] args) {
        new SynDemo6().method();
    }

    public synchronized void method() {
        System.out.println("a==" + a);
        if (a == 0) {
            a++;
            method();
        }
    }
}
