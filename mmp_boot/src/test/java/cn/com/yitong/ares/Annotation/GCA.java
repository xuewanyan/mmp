package cn.com.yitong.ares.Annotation;

/**
 * 观察者A
 */
public class GCA {
    @Subscribe
    public void a(EventA a){
        System.out.println("tid:" + Thread.currentThread().getId() + "=======" + a.name);
    }
}
