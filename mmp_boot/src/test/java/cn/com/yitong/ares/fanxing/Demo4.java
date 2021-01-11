package cn.com.yitong.ares.fanxing;

public class Demo4<T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

class Demo5 {

    public static void main(String[] args) {
        Demo4<Integer> demo4 = new Demo4<Integer>();
        demo4.setT(11);
        fun(demo4);
    }

    public static void fun(Demo4<?> demo4) { // 输出需要的东西。或者存入需要的东西
        //        demo4.setT("2");
        demo4.getT();
    }
}
