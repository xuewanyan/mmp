package cn.com.yitong.ares.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** 自定义key set */
class Person6 {
    private String name;

    public Person6(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person6{" + "name='" + name + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person6 person6 = (Person6) o;
        return Objects.equals(name, person6.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class Demo6 {
    public static void main(String[] args) {
        Map<Person6, String> map = new HashMap();
        map.put(new Person6("唐三"), new String("小三"));

        System.out.println(map.get(new Person6("唐三")));
    }
}
