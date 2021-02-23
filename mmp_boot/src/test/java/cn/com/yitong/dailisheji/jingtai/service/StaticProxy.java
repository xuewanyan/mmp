package cn.com.yitong.dailisheji.jingtai.service;

import cn.com.yitong.dailisheji.jingtai.dao.IHello;

public class StaticProxy {

    private IHello hello;

    public StaticProxy(IHello hello) {
        this.hello = hello;
    }

    public void sayHello() {
        hello.sayHello();
    }

    public String doSomeThing(String s) {
        return hello.doSomeThing(s);
    }
}
