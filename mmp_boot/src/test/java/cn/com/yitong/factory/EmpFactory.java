package cn.com.yitong.factory;

import cn.com.yitong.dao.IEmpDao;
import cn.com.yitong.dao.impl.EmpDaoImpl;

import java.sql.Connection;

/** 工厂类 */
public class EmpFactory {

    /**
     * 获取ImpDao实例
     *
     * @param connection
     * @return
     */
    public static IEmpDao getIempDaoInstance(Connection connection) {
        return new EmpDaoImpl(connection);
    }
}
