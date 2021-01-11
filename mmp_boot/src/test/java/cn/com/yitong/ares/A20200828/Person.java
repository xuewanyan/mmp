package cn.com.yitong.ares.A20200828;

public class Person {

    private static final String A="1";
    private static final String B="1";
    private static final String C="1";

    public Person(){

    }

    public void setOne(){

    }

    public Object doSon1 (){
        return new Person();
    }
    public <T> T doSon(){
        return (T) new Person();
    }
}
