package cn.com.yitong.ares.java8After;

interface A1{
    public void eat();
}

public class Mde implements A1 {
    @Override
    public void eat() {
        System.out.println("111");
    }


}

class Ma implements A1{

    @Override
    public void eat() {
        System.out.println("222");
    }
}

class Demo{
    public static void main(String[] args) {
        Demo demo = new Demo();
        A1 a1 = new Mde();
        A1 a2 = new Ma();
        demo.fun(a1);
        demo.fun(a2);
        a1.eat();
    }
    public void fun(Mde mde){

    }
    public void fun(Ma ma){

    }
    public void fun(A1 a){

    }
}