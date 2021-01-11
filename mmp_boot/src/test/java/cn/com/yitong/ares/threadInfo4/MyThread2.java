package cn.com.yitong.ares.threadInfo4;

/**
 * 生产者与消费者
 */
public class MyThread2 {
    public static void main(String[] args) {
        //
        Info2 info = new Info2();
        Product2 product = new Product2(info);
        Consumer2 consumer = new Consumer2(info);
        new Thread(product).start();
        new Thread(consumer).start();
    }
}

class Info2 {
    private String title;
    private String content;

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
        this.title = title;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;
    }

    public synchronized void get() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.title + "------" + this.content);
    }
}

/**
 * 生产者
 */
class Product2 implements Runnable {

    private Info2 info;

    public Product2(Info2 info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int x = 0; x < 50; x++) {
            if (x % 2 == 0) {
                this.info.set("标题1", "标题1的内容");
            } else {
                this.info.set("标题2", "标题2的内容");
            }
        }
    }
}

class Consumer2 implements Runnable {

    private Info2 info;

    public Consumer2(Info2 info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int x = 0; x < 50; x++) {
            this.info.get();
        }
    }
}
