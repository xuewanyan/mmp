package cn.com.yitong.ares.Annotation2;

import org.springframework.validation.annotation.Validated;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CustomAnno {
    public String apple() default "苹果";
    public int per() default 0;
}
