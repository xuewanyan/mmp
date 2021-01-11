package cn.com.yitong.ares.interfaceInfo;

/**
 * 电脑-接口实例
 */
public class Computer {

    public void plugin(Usb usb){
        usb.start();
        usb.stop();
    }
}
