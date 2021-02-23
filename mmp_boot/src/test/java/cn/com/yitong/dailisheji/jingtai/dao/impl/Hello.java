package cn.com.yitong.dailisheji.jingtai.dao.impl;

import cn.com.yitong.dailisheji.jingtai.dao.IHello;

public class Hello implements IHello {
    @Override
    public void sayHello() {
        System.out.println("xueyan");
    }

    @Override
    public String doSomeThing(String s) {
        return s;
    }
}
