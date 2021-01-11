package cn.com.yitong.ares.quote;

/**
 * 人 车的 测试方法
 */
public class PerTest {

    public static void main(String[] args) {
//        Per per = new Per(1,"英雄");
        Per per1 = new Per(2,"英雄的孩子");
//        Car car = new Car("NINICE");
        Car car1 = new Car("BMW");

        per1.setChildren(per1);
        per1.setCar(car1);
        car1.setPer(per1);
        System.out.println(per1.getChildren().getPerInfo());
        System.out.println(car1.getPer().getChildren().getCar().getCarInfo());


    }
}
