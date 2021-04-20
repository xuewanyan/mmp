package cn.com.yitong.ares.exception;

import org.springframework.util.Assert;

public class TestDemo {

    public static void main(String[] args) {
        String idea = "";
        tesu(idea);
    }

    public static void tesu(String idea) {
        Assert.hasLength(idea, "idea must be not null");
    }
}
