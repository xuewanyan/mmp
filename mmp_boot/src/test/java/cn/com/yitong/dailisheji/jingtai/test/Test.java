package cn.com.yitong.dailisheji.jingtai.test;

import cn.com.yitong.dailisheji.jingtai.dao.impl.Hello;
import cn.com.yitong.dailisheji.jingtai.service.StaticProxy;

public class Test {
    public static void main(String[] args) {
        StaticProxy staticProxy = new StaticProxy(new Hello());
        staticProxy.sayHello();
        System.out.println(staticProxy.doSomeThing("xxxxxxxx"));
    }
}
