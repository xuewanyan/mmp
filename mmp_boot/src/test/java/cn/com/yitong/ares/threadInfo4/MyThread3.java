package cn.com.yitong.ares.threadInfo4;

/** 生产者与消费者，解决重复生产问题 */
public class MyThread3 {
    private Info3 info3;

    public static void main(String[] args) {
        //
        Info3 info = new Info3();
        Product3 product = new Product3(info);
        Consumer3 consumer = new Consumer3(info);
        new Thread(product).start();
        new Thread(consumer).start();
    }
}

class Info3 {
    private String title;
    private String content;
    public boolean flag = true; // ture可以生产 不可以取走

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public synchronized void set(String title, String content) {
        if (this.flag == false) { // 表示已经生产过了 还未取走
            try {
                super.wait(); // 等待
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 生产
        this.title = title;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;
        this.flag = false;
        super.notify();
    }

    public synchronized void get() {
        try {
            if (this.flag == true) { // 还未生产
                super.wait();
            }
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.title + "------" + this.content);
        this.flag = true;
        super.notify();
    }

    public void dealThread(Thread thread) {
        thread.interrupt();
    }
}

/** 生产者 */
class Product3 implements Runnable {

    private Info3 info;

    public Product3(Info3 info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int x = 0; x < 50; x++) {
            if (x % 2 == 0) {
                this.info.set("标题==1", "标题1的内容");
            } else {
                this.info.set("标题==3", "标题3的内容");
            }
        }
    }
}

class Consumer3 implements Runnable {

    private Info3 info;

    public Consumer3(Info3 info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            this.info.get();
        }
    }
}
