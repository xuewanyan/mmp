package cn.com.yitong.ares.Annotation4;

/**
 * TVChannel
 */
public class TVChannel implements IChannel{

    @Override
    public boolean build() {
        System.out.println("TVChannel：电视通道建立了");
        return true;
    }

    @Override
    public void close() throws Exception {
        System.out.println("TVChannel：关闭电视通道");
    }
}
