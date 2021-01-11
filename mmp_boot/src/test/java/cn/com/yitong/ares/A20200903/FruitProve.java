package cn.com.yitong.ares.A20200903;

import java.lang.annotation.*;

/**
 * 定义注解接口
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitProve {

    public int id() default  -1;

    public String name() default "";

    public String address() default "";
}
