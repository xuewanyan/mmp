package cn.com.yitong.ares.genericity;

/**
 * 泛型转型
 * @author xueyan
 * @date 20201114
 */
public class Generatial<T> {
    public T x;
    public T y;

    public void setX(T x){
        this.x = x;
    }

    public void setY(T y){
        this.y = y;
    }

    public T getX(){
        return x;
    }

    public T getY(){
        return y;
    }

    public static void main(String[] args) {
        Generatial<String> t = new Generatial<String>();
        t.setX("2");

    }
}
