package cn.com.yitong.ares.jdbcInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo3 {
    private static final String ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String ORACLE_NAME = "mmc";
    private static final String ORACLE_PWD = "111111";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // 第一步：加载数据库驱动程序
        Class.forName(ORACLE_DRIVER); // 向容器中添加驱动程序连接类
        // 第二步：取得数据库的连接对象
        Connection connection = DriverManager.getConnection(ORACLE_URL, ORACLE_NAME, ORACLE_PWD);

        // 第三步：进行数据库操作
        Statement statement = connection.createStatement();

        String sql = "insert into mmc.TBS_MMP (TASKID,SERVERTIME) values ('YXZS12231','2021-0808')";
        statement.execute(sql);

        System.out.println("con: " + connection);

        connection.close();
    }
}
