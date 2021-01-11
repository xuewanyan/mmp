package cn.com.yitong.ares.Annotation4;

/**
 * IphoneChannel
 */
public class IphoneChannel implements IChannel{
    @Override
    public boolean build() {
        System.out.println("IphoneChannel:手机通道建立了");
        return true;
    }

    @Override
    public void close() throws Exception {
        System.out.println("IphoneChannel:关闭手机通道");
    }
}
