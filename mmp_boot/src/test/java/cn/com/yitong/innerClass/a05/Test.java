package cn.com.yitong.innerClass.a05;

import javafx.concurrent.Worker;

public class Test {
    public void Test(Person worker){
        System.out.println(worker.getName()+ worker.workTime());
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.Test(new Person() {
            @Override
            public int workTime() {
                return 222;
            }
            @Override
            public String getName(){
                return "11";
            }
        });
    }
}
