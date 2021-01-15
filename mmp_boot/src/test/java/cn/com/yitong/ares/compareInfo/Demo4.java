package cn.com.yitong.ares.compareInfo;

import java.util.Arrays;
import java.util.Comparator;

/** Comparator */
class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
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
}

class PersonComparator implements Comparator<Person2> {

    @Override
    public int compare(Person2 o1, Person2 o2) {
        return o1.getAge() - o2.getAge();
    }
}

public class Demo4 {
    public static void main(String[] args) throws Exception {
        Person2 person[] =
                new Person2[] {new Person2("大", 77), new Person2("中", 66), new Person2("小", 55)};

        Arrays.sort(person, new PersonComparator());
        System.out.println(Arrays.toString(person));
    }
}
