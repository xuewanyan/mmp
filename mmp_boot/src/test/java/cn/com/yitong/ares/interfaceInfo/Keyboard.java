package cn.com.yitong.ares.interfaceInfo;

public class Keyboard implements Usb{
    @Override
    public void start() {
        System.out.println("键盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("键盘停止工作");
    }
}
