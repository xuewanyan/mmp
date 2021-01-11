package cn.com.yitong.ares.objectInfo;

public class A {


    public static void main(String[] args) {
        Object object = new int[]{1,2,3};
        if(object instanceof int[]){
            int [] a = (int[]) object;
        }
    }

}


interface Userd{

}
