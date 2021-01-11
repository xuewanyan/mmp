package cn.com.yitong.ares.thisFolder;

/**
 * 员工
 */
public class Emp {

    private String name;
    private String job;
    private String dept;
    private double sal;

    public void getInfo(){
        System.out.println("name=" + name + ",job=" + job + ",dept=" + dept + ",sal="+ sal);
    }

    public Emp(){
        this("x1","程序员","科技部",10000.0);
    }
    public Emp(String name){
        this(name,"程序员","科技部",10000.0);
    }
    public Emp(String name,String job,String dept){
        this(name,job,dept,10000);
    }
    public Emp(String name,String job,String dept,double sal){
         this.name = name;
         this.job = job;
         this.dept = dept;
         this.sal = sal;
    }

}
