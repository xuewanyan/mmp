package cn.com.yitong.ares.serion;

import java.io.*;

/** 实现序列化 */
public class Demo1 implements Serializable {

    private String name;
    private transient int age;

    public Demo1(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Demo1{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

    public static void main(String[] args) throws Exception {
        ObjectOutputStream os =
                new ObjectOutputStream(
                        new FileOutputStream(
                                new File(
                                        "D:"
                                                + File.separator
                                                + "hello"
                                                + File.separator
                                                + "my.txt")));
        os.writeObject(new Demo1("中国", 10000));
        os.close();

        // 反序列化
        ObjectInputStream oi =
                new ObjectInputStream(
                        new FileInputStream(
                                new File(
                                        "D:"
                                                + File.separator
                                                + "hello"
                                                + File.separator
                                                + "my.txt")));
        Object obj = oi.readObject();
        System.out.println(obj);
    }
}
