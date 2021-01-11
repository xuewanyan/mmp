package cn.com.yitong.ares.Annotation2;

import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
@RequestMapping
public class Test {

    public static void goPuus(Class <?> clazz){
        Field[] fields = clazz.getDeclaredFields();
        for(Field fields1:fields){
            CustomAnno anno = fields1.getAnnotation(CustomAnno.class);
            String app = "";
            int pre = 2;
            if(anno != null){
                app = anno.apple();
                pre = anno.per();
                System.out.println(""+app);
            }else {
                app = fields1.getName();
                System.out.println(""+app);
            }


        }
    }

    public static void main(String[] args){
        Test.goPuus(CustTest.class);
    }
}
