package cn.com.yitong.ares.A20200617;

import org.junit.jupiter.api.BeforeEach;

/**
 * abc工厂枚举
 */
public enum ABCEnum {
    A("cn.com.yitong.ares.A20200617.A"),B("cn.com.yitong.ares.A20200617.B"),C("C"),D("D");
    private String id;
    /**
     * 构造器
     * @param id
     */
    private ABCEnum(String id){
        this.id = id;
    }

    @BeforeEach
    void setUp() {
        this.id=id;
    }

    public String getId() {
        return id;
    }

    /**
     * 获取工厂
     */
    public static String getFactory(String idd){
        ABCEnum[] abc = ABCEnum.values();
        System.out.println(abc);
        for(ABCEnum str :abc){
            if(idd.equals(str.name())){
               return  str.id;
            }
        }
        return null;
    }

    public static void main(String[] args){
        System.out.println(ABCEnum.getFactory("A"));
    }
}
