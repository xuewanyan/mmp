package cn.com.yitong.ares.threadInfo4;

public class StringLock {
    public void method() {
        synchronized ("字符串常量") {
            try {
                while (true) {
                    System.out.println("当前线程：" + Thread.currentThread().getName() + "开始");
                    Thread.sleep(1000);
                    System.out.println("当前线程：" + Thread.currentThread().getName() + "结束");
                }
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }

    public static void main(String[] args) {
        final StringLock sl = new StringLock();
        Thread t1 =
                new Thread(
                        new Runnable() {
                            @Override
                            public void run() {
                                // TODO Auto-generated method stub
                                sl.method();
                            }
                        },
                        "t1");
        Thread t2 =
                new Thread(
                        new Runnable() {
                            @Override
                            public void run() {
                                // TODO Auto-generated method stub
                                sl.method();
                            }
                        },
                        "t2");
        t1.start();
        t2.start();
    }
}
