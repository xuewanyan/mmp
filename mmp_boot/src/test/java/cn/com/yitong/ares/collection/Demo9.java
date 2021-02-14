package cn.com.yitong.ares.collection;

import java.util.ArrayList;
import java.util.List;

/** MapReduce案例：订单处理 */
class Order {
    private String title; // 分类名字
    private double price; // 商品价格
    private int amount; // 商品总量

    public Order(String title, double price, int amount) {
        this.title = title;
        this.price = price;
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

public class Demo9 {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>();
        list.add(new Order("办公用品", 19.9, 2345));
        list.add(new Order("电脑", 8000.99, 2345));
        list.add(new Order("生活用品", 10.9, 222222));
        list.add(new Order("餐饮", 50.63, 297450988));
        double all =
                list.stream()
                        .map((x) -> x.getPrice() * x.getAmount())
                        .reduce((sum, m) -> sum + m)
                        .get();
        System.out.println(all);
    }
}
