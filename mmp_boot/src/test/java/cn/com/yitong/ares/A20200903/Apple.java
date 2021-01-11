package cn.com.yitong.ares.A20200903;

/**
 * 创建注解
 */
public class Apple {

    @FruitProve(id = 4040,name = "测试姓名",address = "测试地址")
    private String applePrive;


    public String getApplePrive() {
        return applePrive;
    }

    public void setApplePrive(String applePrive) {
        this.applePrive = applePrive;
    }
}
