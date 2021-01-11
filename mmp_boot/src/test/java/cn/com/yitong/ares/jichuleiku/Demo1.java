package cn.com.yitong.ares.jichuleiku;

/** Runtime对象 */
public class Demo1 {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory() / 1024 / 1024);
        System.out.println(runtime.totalMemory() / 1024 / 1024);
        System.out.println(runtime.freeMemory() / 1024 / 1024);
    }
}
