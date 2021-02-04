package cn.com.yitong.ares.taskInfo2;

public class RunnableOp implements Runnable {

    private Product product;

    public RunnableOp(Product product) {
        this.product = product;
    }

    @Override
    public void run() {
        System.out.println("当前标识：" + this.product.flag);
        this.product.getFlag();
        System.out.println("设置之后的标识：" + this.product.flag);
        new TimerOp().startOp(this.product);
    }
}
