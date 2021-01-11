package cn.com.yitong.ares.interfaceInfo;

public class FrultFactory {

    public static <T> T  getInstance(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        return (T) Class.forName(className).newInstance();
    }
}
