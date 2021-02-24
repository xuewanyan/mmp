package cn.com.yitong.ares.quote;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean compare(Person2 person) {
        if (this == person) {
            return true;
        }
        if (null == person) {
            return false;
        }

        if (this.name.equals(person.name) && this.age == person.age) {
            return true;
        }
        return false;
    }
}

public class Demo2 {
    public static void main(String[] args) {
        Person2 person2 = new Person2("张三", 11);
        Person2 person3 = new Person2("张三", 11);
        if (person2.compare(person3)) {
            System.out.println("是同一人");
        } else {
            System.out.println("不是同一人");
        }
    }
}
