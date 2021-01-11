package cn.com.yitong.innerClass.a05;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态内部类
 */
public class OuterClass {
    /**
     * clssName
     */
    private static String clssName = "staticInnerClass";

    public static class StaticInnerClass{
        public void getClassName(){
            System.out.println("className:" + clssName);
            Map map = new HashMap<String,Object>();
            map.put("","");
        }
    }

    public static void main(String[] args) {
        OuterClass.StaticInnerClass staticInnerClass = new StaticInnerClass();
        staticInnerClass.getClassName();
    }
}
