package cn.com.yitong.ares.fanxing;

public class PointPlus <T>{

    private T x;
    private T Y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return Y;
    }

    public void setY(T y) {
        Y = y;
    }
}
class Demo1{
    public static void main(String[] args) {
        PointPlus<Integer> pointPlus = new PointPlus();
        pointPlus.setX(11);
        pointPlus.setY(22);
        System.out.println(pointPlus.getX());
        System.out.println(pointPlus.getY());
    }
}