package cn.com.yitong.ares.genericity;

import org.apache.commons.collections4.ListUtils;

public class Message<T> {

    private T info;

    public void run(Message<? super Integer> msg){
        System.out.println(msg.getInfo());
    }

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public static void main(String[] args) {
        Message<Integer> message = new Message<Integer>();
        message.setInfo(1111);
        message.run(message);
    }
}
