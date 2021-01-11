package cn.com.yitong.ares.quote;

public class Car {

    private int pid;
    private String cname;
    private Per per;//人

    public Car(String cname){
        this.cname = cname;
    }

    public String getCarInfo(){
        return "汽车名称：" + this.cname;
    }

    public void setPer(Per per){
        this.per = per;
    }

    public Per getPer(){
        return this.per;
    }
}
