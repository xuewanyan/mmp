package cn.com.yitong.ares.java8After;

/**
 * 对象的引用
 */
public interface ICompare <P,R>{ //P表示参数类型，而R表示返回值类型
    public R compare(P p1,P p2);    //接收的两个数据
}

class Demo3{
    public static void main(String[] args) {
        ICompare<String,Integer> iCompare = String :: compareTo;
        System.out.println(iCompare.compare("1000","2222"));
    }
}