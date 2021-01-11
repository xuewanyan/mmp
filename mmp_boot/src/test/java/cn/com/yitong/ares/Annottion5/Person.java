package cn.com.yitong.ares.Annottion5;

/**
 * 实体类
 */
public class Person {

    @Action(name = "name1",targetName = "")
    private String name;

    @Action(name = "sex1",targetName = "")
    private String sex;

    @Action(name = "age1",targetName = "age2")
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
