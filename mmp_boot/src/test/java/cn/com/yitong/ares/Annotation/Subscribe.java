package cn.com.yitong.ares.Annotation;

import java.lang.annotation.*;

/**
 * 自定义注解
 */
@Target(ElementType.METHOD)//指定注解可以修饰的元素（type,methed）
@Retention(RetentionPolicy.RUNTIME)//指定注解保留的范围（源码，class文件，RUNTIME）
@Documented//指定注解是否出现在javadoc生成的api文档中的具体的元素上
@Inherited//指定注解是否可以被子类继承
public @interface Subscribe {
    ThreadMeth threadMeth() default ThreadMeth.Main;
}
