package cn.com.yitong.ares.Annotation4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义action控制
 */
@Target(ElementType.TYPE)//作用在类上
@Retention(RetentionPolicy.RUNTIME)//运行时生效
public @interface Action {
    public String value();
}
