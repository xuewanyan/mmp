package cn.com.yitong.ares.thisFolder;

/**
 * this method
 * @author xy
 * @date 20201126
 */
public class ThisMethod {

    private String name;
    private int age;

    public ThisMethod(){
        System.out.println("================只想");
    }

    public ThisMethod(String name){
        this();
        this.name = name;
    }

    public ThisMethod(int age,String name){
        this(name);
        this.age = age;
    }

}
