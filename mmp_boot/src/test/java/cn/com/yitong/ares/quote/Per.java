package cn.com.yitong.ares.quote;

public class Per {

    private int pid;
    private String name;
    private Car car;
    private Per children;

    public Per(int pid,String name){
        this.pid = pid;
        this.name = name;
    }

    public String getPerInfo(){
        return "姓名：" + this.name + "，编号" + this.pid;
    }

    public void setCar(Car car){
        this.car = car;
    }

    public Car getCar(){
        return this.car;
    }

    public void setChildren(Per per){
        this.children = per;
    }

    public Per getChildren(){
        return this.children;
    }

}
