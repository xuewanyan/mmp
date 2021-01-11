package cn.com.yitong.ares.fanxing;

import java.util.HashMap;
import java.util.Map;

/**
 * 范型接口，
 * @param <T>
 */
public interface IMessage<T> {
    public void print(T t);
}

class MessageImpl<P> implements IMessage<P>{

    public void print(P p) {
        System.out.println(p);
    }
}
class Demo3{
    public static void main(String[] args) {
        MessageImpl<String> message = new MessageImpl<String>();
        message.print("sss");
    }

    /**
     * 声明 并使用范型
     * @param t <T> 使用范型
     * @param <T> 声明范型
     */
    public static <T> void fun(T t){

    }
}