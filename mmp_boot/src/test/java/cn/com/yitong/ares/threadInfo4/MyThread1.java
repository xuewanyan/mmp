package cn.com.yitong.ares.threadInfo4;

/**
 * 生产者与消费者
 */
public class MyThread1 {
    public static void main(String[] args) {
        //
        Info info = new Info();
        Product product = new Product(info);
        Consumer consumer = new Consumer(info);
        new Thread(product).start();
        new Thread(consumer).start();
    }
}

class Info {
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
}

/**
 * 生产者
 */
class Product implements Runnable {

    private Info info;

    public Product(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int x = 0; x < 50; x++) {
            if (x % 2 == 0) {
                this.info.setTitle("标题1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.info.setContent("标题1的内容");
            } else {
                this.info.setTitle("标题2");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.info.setContent("标题2的内容");
            }
        }
    }
}

class Consumer implements Runnable {

    private Info info;

    public Consumer(Info info) {
        this.info = info;
    }

    @Override
    public void run() {
        for (int x = 0; x < 50; x++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.info.getTitle() + "------" + this.info.getContent());
        }
    }
}
