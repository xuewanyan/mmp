package cn.com.yitong.ares.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person2 person2 = (Person2) o;
        return age == person2.age && Objects.equals(name, person2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Person2 person = new Person2("大", 99);
        Person2 person1 = new Person2("中", 88);
        Person2 person4 = new Person2("中", 88);
        Person2 person2 = new Person2("小", 77);
        Person2 person3 = new Person2("小2", 77);

        Set<Person2> set = new HashSet<>();
        set.add(person);
        set.add(person1);
        set.add(person2);
        set.add(person3);
        set.add(person4);
        System.out.println(set);
    }
}
