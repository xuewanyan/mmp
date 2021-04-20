package cn.com.yitong.ares.synchorized;

/** 对象锁 */
public class SynDemo11 {
    Object object = new Object();

    public void methoid() {
        synchronized (object) {
        }
    }
}
