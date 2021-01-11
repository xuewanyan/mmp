package cn.com.yitong.ares.fanxing;

import java.io.File;
import java.nio.file.Files;

public class Message<T>{
    private T info;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }
}


class Demo2{
    public static void main(String[] args) {
        Message<String> message = new Message<String>();
        message.setInfo("11111");
        fun(message);
    }

    public static void fun(Message<? super String> temp){
        System.out.println(temp.getInfo());
    }
}
