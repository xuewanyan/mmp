package cn.com.yitong.ares.exception;

public class TestDemo {

    public static void main(String[] args) {
        int num = 10;
        //中间可能进行了3步num变量的处理
        assert num == 100;// 断言错误，Num的内容不是100
        System.out.println(num);

    }
}
