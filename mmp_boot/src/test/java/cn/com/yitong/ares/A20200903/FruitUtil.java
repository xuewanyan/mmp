package cn.com.yitong.ares.A20200903;

import java.lang.reflect.Field;

/**
 * 注解处理器，使用注解
 */
public class FruitUtil {
    public static void getFruitInfo(Class<?> clazz){
        String str = "供应商信息：";
        Field[] fields = clazz.getDeclaredFields();
        for(Field file:fields){
            if(file.isAnnotationPresent(FruitProve.class)){
                FruitProve fer = file.getAnnotation(FruitProve.class);
                str = "供应商编号=" + fer.id() + "供应商名称=" + fer.name() + "供应商地址="+ fer.address();
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args){
        FruitUtil.getFruitInfo(Apple.class);
    }
}
