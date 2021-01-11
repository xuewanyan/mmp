package cn.com.yitong.ares.exception;

public class ExceptrionmTest extends RuntimeException{

    public ExceptrionmTest(String msg){
        super(msg);
    }
}



class Demo{
    public static void main(String[] args) {
        double score = 120;
        if(score > 100){
            throw new ExceptrionmTest("乘机太好了");
        }
    }
}