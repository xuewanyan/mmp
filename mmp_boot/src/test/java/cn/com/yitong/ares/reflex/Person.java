package cn.com.yitong.ares.reflex;

public class Person {

    private final static String age = "15";

    private final static String sex = "男";

    public void demo(String id){
        if("15".equals(age)){
            System.out.println("15+++++");
        }else if("男".equals(sex)){
            System.out.println("男+++++");
        }
    }

    public void demo1(int aa){
        System.out.println(aa);
    }


}
