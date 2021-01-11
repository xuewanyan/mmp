package cn.com.yitong.ares.StringDsc;

public class Test {
    private int age;
    private String sex;


    public Test(int age,String sex){
        this.age = age;
        this.sex = sex;
    }

    public void getTest1(){
        System.out.println("age = " +age + "," + "sex = " + sex);
    }

}

class GetTest{

    public static void main(String[] args) {
        Test tt = new Test(1,"2");
        tt.getTest1();
    }

}