package cn.com.yitong.ares.fanshe;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

/** 反射-正常的操作 */
public class Demo1 {
    public static void main(String[] args) throws Exception {

        // 正射
        java.util.Date date = new java.util.Date();

        System.out.println(date);

        // 观察反射
        System.out.println(date.getClass());

        Class<?> clazz = date.getClass();
        System.out.println("全名:" + clazz.getName());
        System.out.println("类名：" + clazz.getSimpleName());

        // 利用类。class
        Class<?> clazz2 = java.util.Date.class;
        System.out.println("全名2:" + clazz2.getName());
        System.out.println("类名2：" + clazz2.getSimpleName());

        // 利用Class类的静态方法来实现
        Class<?> clazz3 = Class.forName("java.util.Date");
        System.out.println("全名3:" + clazz3.getName());
        System.out.println("类名3：" + clazz3.getSimpleName());

        // 实例化对象 通过反射来实现
        Class<?> clazz4 = Class.forName("java.util.Date");
        Date date1 = (Date) clazz4.newInstance();
        System.out.println("date1:" + date1);

        // 实现自定义类的实例化对象 通过反射机制来实现
        Class<?> clazz5 = Class.forName("cn.com.yitong.ares.fanshe.Person");
        Person person = (Person) clazz5.newInstance();
        System.out.println("person:" + person);

        // 实现类的实例化对象 调用定指构造实例化对象 只有有参构造方法的实现 反射机制
        Class<?> clazz6 = Class.forName("cn.com.yitong.ares.fanshe.Person2");
        Constructor<?> constructor = clazz6.getConstructor(String.class, int.class);
        Person2 person2 = (Person2) constructor.newInstance("中出", 200);
        System.out.println("person2:" + person2);

        // 反射调用方法
        String name = "name"; // value = "加百利"设置进去

        Class<?> clazz7 = Class.forName("cn.com.yitong.ares.fanshe.Person2");
        Object person21 = clazz7.newInstance();
        Method method = clazz7.getMethod("setName", String.class);
        method.invoke(person21, "加百利");
        Method method1 = clazz7.getMethod("getName");
        System.out.println(method1.invoke(person21));

        // 反射调用本类成员
        Class<?> clazz8 = Class.forName("cn.com.yitong.ares.fanshe.Person2");
        Object obj = clazz8.newInstance();
        Field field = clazz8.getDeclaredField("name");
        field.setAccessible(true); // 取消封装 去除private
        field.set(obj, "新加百利");

        System.out.println("clazz8: " + field.get(obj));
    }
}

class Person {
    public Person() {
        System.out.println("实例化对象");
    }

    @Override
    public String toString() {
        return "中出加两百";
    }
}

class Person2 {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Person2() {}

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person2{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
