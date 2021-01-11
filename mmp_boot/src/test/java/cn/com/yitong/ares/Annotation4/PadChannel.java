package cn.com.yitong.ares.Annotation4;

/**
 * PadChannel
 */
public class PadChannel implements IChannel{
    @Override
    public boolean build() {
        System.out.println("PadChannel：平板通道建立了");
        return true;
    }

    @Override
    public void close() throws Exception {
        System.out.println("PadChannel：关闭平板通道");
    }
}
