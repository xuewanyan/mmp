package cn.com.yitong.ares.interfaceInfo;

public class TestDemo {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
//        Computer computer = new Computer();
//        computer.plugin(new Flash());
//        computer.plugin(new Keyboard());

        Frult f = FrultFactory.getInstance("cn.com.yitong.ares.interfaceInfo.Apple");
        f.eat();
    }
}
