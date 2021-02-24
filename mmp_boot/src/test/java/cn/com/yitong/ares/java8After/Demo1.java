package cn.com.yitong.ares.java8After;

interface Fruit {
    public void eat();

    static Fruit getInstance() {
        //        return new Fruit() {
        //            @Override
        //            public void eat() {
        //                clean();
        //                System.out.println("吃水果");
        //            }
        //        };
        return () -> {
            System.out.println("22");
            System.out.println(22233);
        };
    }
}

class Apple implements Fruit {

    @Override
    public void eat() {}
}

public class Demo1 {
    public static void main(String[] args) {
        Fruit.getInstance().eat();
    }
}
