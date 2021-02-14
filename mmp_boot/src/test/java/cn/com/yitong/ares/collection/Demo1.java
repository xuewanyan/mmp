package cn.com.yitong.ares.collection;

import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) {
            return -1;
        } else {
            return this.name.compareTo(o.name);
        }
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Person person = new Person("大", 99);
        Person person1 = new Person("中", 88);
        Person person2 = new Person("小", 77);
        Person person3 = new Person("小2", 77);

        Set<Person> set = new TreeSet<Person>();
        set.add(person);
        set.add(person1);
        set.add(person2);
        set.add(person3);
        System.out.println(set);
    }
}
