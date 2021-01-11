package cn.com.yitong.ares.Annotation2;

import com.sun.istack.internal.NotNull;
import org.springframework.web.bind.annotation.PathVariable;

public class CustTest {

    @CustomAnno(apple = "香蕉")
    private String apple;

    private int pre;

    public String getApple() {
        return apple;
    }

    public void setApple(@NotNull  String apple) {
        this.apple = apple;
    }

    public int getPre() {
        return pre;
    }

    public void setPre(@PathVariable int pre) {
        this.pre = pre;
    }
}
