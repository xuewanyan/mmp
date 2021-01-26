package cn.com.yitong.ares.jdbcInfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo2 {

    private static final String ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
    private static final String ORACLE_NAME = "mmc";
    private static final String ORACLE_PWD = "111111";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 第一步：加载数据库驱动程序
        Class.forName(ORACLE_DRIVER); // 向容器中添加驱动程序连接类
        // 取得   数据库的连接对象
        Connection connection = DriverManager.getConnection(ORACLE_URL, ORACLE_NAME, ORACLE_PWD);

        String sql = "";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, 11);
        preparedStatement.setInt(2, 11);

        System.out.println("con: " + connection);

        connection.close();
    }
}
