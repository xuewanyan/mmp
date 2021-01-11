package cn.com.yitong.ares.Annotation4;

import java.lang.reflect.InvocationTargetException;

/**
 * factory工程类
 */
public class Factory {

    /**
     * 构造方法
     */
    private Factory(){

    }
    public static <T> T getInstance(String className){

        try {
            return (T) Class.forName(className).getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}
