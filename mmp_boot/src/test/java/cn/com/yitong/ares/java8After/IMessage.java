package cn.com.yitong.ares.java8After;

/**
 * 方法引用
 */
public interface IMessage<P,R> {
    public R replace(P p);
}


class Demo2{
    public static void main(String[] args) {
        IMessage<Integer,String> message = String :: valueOf;
        String value = message.replace(1000);
        System.out.println(value instanceof String);
    }
}