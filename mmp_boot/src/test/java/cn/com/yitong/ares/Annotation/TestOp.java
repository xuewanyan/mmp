package cn.com.yitong.ares.Annotation;

public class TestOp {
    public static void main(String[] args){
        GCA a = new GCA();
        GCB b = new GCB();
        MyBus my = new MyBus();
        my.redeist(a);
        my.redeist(b);

        EventA aa = new EventA();
        aa.name = "AAAAAAAA";

        EventB bb = new EventB();
        bb.name="BBBBBBB";

        my.post(aa);
        my.post(bb);
    }
}
