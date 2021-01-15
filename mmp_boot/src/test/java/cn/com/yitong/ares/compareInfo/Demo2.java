package cn.com.yitong.ares.compareInfo;

import java.util.Arrays;

/** Comparable */
class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Person o) {
        System.out.println(this.age - o.age);
        return this.age - o.age;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Person person[] =
                new Person[] {new Person("大", 77), new Person("中", 66), new Person("小", 55)};

        Arrays.sort(person);
        System.out.println(Arrays.toString(person));
    }
}
