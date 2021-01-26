package cn.com.yitong.ares.jdbcInfo;

class DageBase implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("该数据库的资源已经被释放了");
    }
}

public class AutoCloseDemo {
    public static void main(String[] args) throws Exception {
        DageBase dageBase = new DageBase();
        dageBase = null;
        System.gc();
        Thread.sleep(10000);
    }
}
