package cn.com.yitong.ares.Annottion5;

import org.junit.platform.commons.util.StringUtils;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 业务处理
 */
public class GetActionInfo {

    public static void getAction(Object obj,Class<?> clazz){

        Field[] fields = clazz.getDeclaredFields();//获取传入bean的属性fields

        PropertyDescriptor propertyDescriptor = null;
        for(Field field:fields){
            try {
            Action action = field.getAnnotation(Action.class);
            String name = "";
            if(null != action){
                name = StringUtils.isNotBlank(action.name()) ? action.name() : action.targetName();
            }else {
                name = field.getName();
            }
                propertyDescriptor = new PropertyDescriptor(field.getName(),clazz);
                Method getMethod = propertyDescriptor.getReadMethod();//获取对应属性的get方法
                Object object = getMethod.invoke(obj);
                System.out.println("="+object);
                Method setMethod = propertyDescriptor.getWriteMethod();
                System.out.println("method=" + setMethod);
                System.out.println("name = " + name);
                setMethod.invoke(obj,object);
                System.out.println("22222222222"+obj);
            } catch (IntrospectionException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
    }
}
