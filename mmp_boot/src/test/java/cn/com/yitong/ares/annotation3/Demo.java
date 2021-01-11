package cn.com.yitong.ares.annotation3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@FunctionalInterface//函数式接口定义
interface IMessage{
    public String echo(String msg);
}


class Demol implements IMessage{
    @Override
    @Deprecated
    public String echo(String msg) {
        return "String";
    }
}



public class Demo {
    public static void main(String[] args) {
        Class<?> clazz = IMessage.class;//获取接口的对象实例
        for (Annotation annotation:clazz.getAnnotations()){//获取annotation
            System.out.println("__________1"+annotation);
        }

        Class<?> clazz2 = Demol.class;//获取class的实列信息
        //获取方法上的annotation信息
        Method method = null;
        try {
            method = clazz2.getDeclaredMethod("echo", String.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        for (Annotation annotation:method.getAnnotations()){
            System.out.println("___________2" + annotation);
        }
        List list = new ArrayList();

        Map map1 = (Map) list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.toList()));
    }
}
