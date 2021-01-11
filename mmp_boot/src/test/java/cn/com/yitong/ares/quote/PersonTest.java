package cn.com.yitong.ares.quote;

public class PersonTest {

    public static void main(String[] args) {
        Person per1 = new Person("都懂",11);
        Person per2 = new Person("不懂",11);
        System.out.println(per1.conpairm(per2));
    }
}
