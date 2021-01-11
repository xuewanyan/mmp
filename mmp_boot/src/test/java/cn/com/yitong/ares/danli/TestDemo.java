package cn.com.yitong.ares.danli;

/**
 * 单例设计 - 饿汉模式
 */
class Singleton{

    private static final Singleton INSTANCE = new Singleton();

    public static Singleton getInstance(){
        return INSTANCE;
    }

    private Singleton(){

    }
    public void print(){
        System.out.println("单例设计");
    }
}

public class TestDemo {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }

}
