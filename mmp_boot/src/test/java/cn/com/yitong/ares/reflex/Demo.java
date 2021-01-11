package cn.com.yitong.ares.reflex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class person = Class.forName("cn.com.yitong.ares.reflex.Person");//获取对象
        Method method = person.getMethod("demo1",int.class);//获取方法
        Constructor<Person> cons = person.getConstructor();//获取constructor对象
        Object obj = cons.newInstance();
        method.invoke(obj,11);
    }
}
