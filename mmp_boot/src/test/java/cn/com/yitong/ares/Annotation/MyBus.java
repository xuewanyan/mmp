package cn.com.yitong.ares.Annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * 测试注解用
 */
public class MyBus {
    LinkedList<Object>  obj = new LinkedList<Object>();

    public void redeist(Object o){
        obj.add(o);
    }

    public void undeist(Object o){
        obj.remove(o);
    }

    public void post(final Object o){
        Iterator<Object> ita = obj.iterator();
        while (ita.hasNext()){
            final Object oo = ita.next();
            Class<? extends Object> clazz = oo.getClass();
            for(final Method method: clazz.getDeclaredMethods()){
                Subscribe sub = method.getAnnotation(Subscribe.class);
                if(sub != null){
                    if(method.getParameterCount() == 1){
                        Class pmClass = (method.getParameterTypes())[0];
                        if(pmClass.equals(o.getClass())){
                            try {
                                if(sub.threadMeth() == ThreadMeth.Main){
                                    method.invoke(ita,o);
                                }else {
                                    new Thread(){
                                        public void run(){
                                            try {
                                                method.invoke(ita,o);
                                            } catch (IllegalAccessException e) {
                                                e.printStackTrace();
                                            } catch (InvocationTargetException e) {
                                                e.printStackTrace();
                                            }
                                        }
                                    }.start();
                                }
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            } catch (InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }
    }
}
