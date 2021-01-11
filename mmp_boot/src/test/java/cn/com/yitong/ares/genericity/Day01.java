package cn.com.yitong.ares.genericity;


import org.mockito.internal.util.StringUtil;

import java.sql.Array;
import java.util.Date;

/**
 * 泛型
 * @author
 * @date 20201114
 */
public class Day01 {

    public static <T> void generalMethod(T ... inputArray){
        for(T element : inputArray){
            if(element instanceof Integer){
                System.out.println("处理Integer类型的数据");
            }else if (element instanceof String){
                System.out.println("处理String类型的数据");
            }else if(element instanceof Double){
                System.out.println("处理Double类型的数据");
            }else if (element instanceof Float){
                System.out.println("处理Float类型的数据");
            }else if(element instanceof Long){
                System.out.println("处理Long类型的数据");
            }else if(element instanceof Boolean){
                System.out.println("处理Boolean类型的数据");
            }else if(element instanceof Date){
                System.out.println("处理date类型的数据");
            }
        }
    }

    public static void main(String[] args) {
        generalMethod("1",2, 2.22222);
    }

}
