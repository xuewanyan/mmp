package cn.com.yitong.ares.quote;

/**
 * 对象比较peroson
 */
public class Person {

    private String name;
    private int age;

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

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    /**
     * 比较对象,此时需要接收一个要比较的对象（对象的本质就是数据的集合）
     * 同时在本方法里面还有一个隐藏的对象：this
     * 此时的conpairm（）方法接收了自己本类的引用
     * @param person
     * @return
     */
    public boolean conpairm(Person person){
        if (null == person){
            return false;
        }
        if(this == person){
            return true;
        }
        if(this.name.equals(person.getName()) && this.age == person.getAge()){
          return true;
        }
        return false;
    }
}
