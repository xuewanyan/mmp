package cn.com.yitong.ares.Annottion5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解
 * @author xy
 * @date 20201120
 */

@Target(ElementType.FIELD)//作用在类上
@Retention(RetentionPolicy.RUNTIME)//运行时生效
public @interface Action {
    String name() default "我是默认名称";//名称
    String targetName() default  "我是备用名称";//备用名称
}
