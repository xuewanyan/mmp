package cn.com.yitong.ares.A20200828;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {

    public static void main(String[] args){
        try {
            Class cls = Class.forName("cn.com.yitong.ares.A20200828.Person");
            Method[] m = cls.getDeclaredMethods();
            for (Method str:m){
                System.out.println("metho:"+m.toString());
            }
            Field[] filed = cls.getDeclaredFields();
            for (Field file:filed){
                System.out.println("filed:" + file);
            }
            Constructor[] constructor = cls.getConstructors();
            for(Constructor c:constructor){
                System.out.println("c:"+c);
            }
            Person p = (Person) cls.newInstance();

            Person p1 = (Person) p.doSon1();
            System.out.println("1:" + p1.doSon1());

            Person p2 = p.doSon();
            System.out.println("1:" + p2.doSon());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}
