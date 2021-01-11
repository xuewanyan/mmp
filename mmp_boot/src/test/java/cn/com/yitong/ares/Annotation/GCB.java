package cn.com.yitong.ares.Annotation;

/**
 * 事件B
 */
public class GCB {
    @Subscribe(threadMeth = ThreadMeth.Posting)
    public void b(EventB b){
        System.out.println("tid:" + Thread.currentThread().getId() + "====" + b.name);
    }
}
