package cn.com.yitong.ares.fanxing;

/**
 * 范型
 * @author xy
 * @date 20201225
 */
public class Point {

    private Object x;
    private Object y;

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }
}

class Demo{
    public static void main(String[] args) {
        Point point = new Point();
//        point.setX(10);
//        point.setY(20);
        // 自动装箱，向上转型
        point.setX(10.1);
        point.setY(10.2);
        // 自动拆箱，向下转型，容易出现类型转换异常，ClassCastException
        double x = (Double) point.getX();
        double y = (Double) point.getY();
        System.out.println(x);
        System.out.println(y);
    }
}