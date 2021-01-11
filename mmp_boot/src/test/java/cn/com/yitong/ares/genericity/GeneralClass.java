package cn.com.yitong.ares.genericity;

/**
 * 泛型类
 * @author xueyan
 * @date 20201114
 */
public class GeneralClass<T> {
    private T t;

    public void add(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public static void main(String[] args) {
        GeneralClass<Integer> t1 = new GeneralClass<Integer>();
        t1.add(1);

        GeneralClass<String> t2 = new GeneralClass<String>();
        t2.add("2");

    }
}
