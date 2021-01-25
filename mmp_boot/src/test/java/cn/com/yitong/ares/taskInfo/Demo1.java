package cn.com.yitong.ares.taskInfo;

import java.util.Observable;
import java.util.Observer;

/** 房价观察者模式 -被观察者 房价 */
class House extends Observable { // 被观察者
    private double price; // 房子的价格

    public House(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        if (price > this.price) { // 房价上涨了才有人关注
            super.setChanged(); // 已经发生了改变
            super.notifyObservers(price); // 通知所有观察者发生了改变
        }
    }
}

/** 观察者 */
class HousePriceObservable implements Observer { // 房子价格的观察者

    private String name;

    public HousePriceObservable(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof House) {
            System.out.println("房价上涨：" + arg);
        }

        System.out.println(o.getClass());
        System.out.println(arg.getClass());
    }
}

public class Demo1 {

    public static void main(String[] args) {
        House house = new House(222222.0); // 被观察者
        Observer observer = new HousePriceObservable("张三"); // 设置观察者
        Observer observer1 = new HousePriceObservable("李四"); // 设置观察者
        Observer observer3 = new HousePriceObservable("王五"); // 设置观察者

        house.addObserver(observer);
        house.addObserver(observer1);
        house.addObserver(observer3);
        house.setPrice(50000000.0);
        //        observer.update(house, 999999); // 追加观察者
        //        observer1.update(house, 999999); // 追加观察者
        //        observer3.update(house, 999999); // 追究观察者
    }
}
