package cn.com.yitong.ares.java8After;

interface ICome{
    default void eat() {
        System.out.println("111111111");
    }
}

public class Defaue implements ICome{
    public static void main(String[] args) {
        ICome iCome = new Defaue();
        iCome.eat();
    }
}
