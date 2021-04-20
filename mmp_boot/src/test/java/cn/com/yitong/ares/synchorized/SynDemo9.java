package cn.com.yitong.ares.synchorized;

/** 对象锁 */
public class SynDemo9 {

    public static void main(String[] args) {
        new SubClass().method();
    }

    public synchronized void method() {
        System.out.println("父类Method");
    }
}

class SubClass extends SynDemo9 {
    public synchronized void method() {
        System.out.println("子类method");
        super.method();
    }
}
