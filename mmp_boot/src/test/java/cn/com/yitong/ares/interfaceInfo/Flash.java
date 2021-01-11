package cn.com.yitong.ares.interfaceInfo;

public class Flash implements Usb{
    @Override
    public void start() {
        System.out.println("开始使用");
    }

    @Override
    public void stop() {
        System.out.println("停止");
    }
}
