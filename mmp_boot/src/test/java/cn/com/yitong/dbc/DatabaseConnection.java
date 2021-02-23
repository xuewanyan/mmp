package cn.com.yitong.dbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 本类负责数据库的连接操作，在进行本类对象实例化时自动进行数据库的连接处理
 *
 * @author xueyan
 * @date 20210220 9:19
 */
public class DatabaseConnection {

    /** oracle 驱动类 */
    private static final String DBDRIVER = "oracle.jdbc.driver.OracleDriver";

    /** 连接地址 */
    private static final String ORACLE_URL = "jdbc:oracle:thin:@localhost:1521:orcl";

    /** 用户名 */
    private static final String ORACLE_NAME = "mmc";
    /** 密码 */
    private static final String ORACLE_PWD = "111111";

    public Connection conn = null;

    /** 在构造方法初始化的时候进行数据库连接对象的取得 */
    private DatabaseConnection() {
        try {
            Class.forName(DBDRIVER); // 加载数据库驱动程序
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("数据库连接失败");
        }
    }

    /**
     * 取得数据库的连接对象
     *
     * @return 实例化的Connection对象，如果返回null，则表示没有连接成功
     */
    public Connection getConncetion() {
        try {
            this.conn = DriverManager.getConnection(ORACLE_URL, ORACLE_NAME, ORACLE_PWD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return this.conn;
    }

    /** 关闭数据库连接 */
    public void close() {
        if (this.conn != null) {
            try {
                this.conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
