package cn.com.yitong.dao.impl;

import cn.com.yitong.dao.IEmpDao;
import cn.com.yitong.vo.Emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * 如果要想操作数据层子类，那么一定要在构造方法种传入Connection接口对象
 *
 * @author xy
 */
public class EmpDaoImpl implements IEmpDao {

    /** Connection连接对象 */
    private Connection connection;

    /** PreparedStatement对象 */
    public PreparedStatement preparedStatement;

    /**
     * 实例化数据层子类对象，同时传入数据库连接对象
     *
     * @param connection Connection连接对象，如果为空表示数据库连接没有打开
     */
    public EmpDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public boolean doCreate(Emp vo) throws Exception {
        String sql = "insert into emp(empno,ename,job,hiredate,sal,comm) values (?,?,?,?,?,?)";
        this.preparedStatement = this.connection.prepareStatement(sql);
        this.preparedStatement.setInt(1, vo.getEmpno());
        this.preparedStatement.setString(2, vo.getEname());
        this.preparedStatement.setString(3, vo.getJob());
        this.preparedStatement.setDate(4, new java.sql.Date(vo.getHiredate().getTime()));
        this.preparedStatement.setDouble(5, vo.getSql());
        this.preparedStatement.setDouble(6, vo.getComn());
        return this.preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean doUpdate(Emp vo) throws Exception {
        String sql =
                "update emp set empno = ?,ename = ?,job = ?,hiredate = ?,sal = ?,comm = ? where empno = ?";
        this.preparedStatement = this.connection.prepareStatement(sql);
        this.preparedStatement.setString(1, vo.getEname());
        this.preparedStatement.setString(2, vo.getJob());
        this.preparedStatement.setDate(3, new java.sql.Date(vo.getHiredate().getTime()));
        this.preparedStatement.setDouble(4, vo.getSql());
        this.preparedStatement.setDouble(5, vo.getComn());
        this.preparedStatement.setInt(6, vo.getEmpno());
        return this.preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean doRemove(Set<Integer> set) throws Exception {
        StringBuffer sb = new StringBuffer();
        sb.append("(");
        Iterator<Integer> iterator = set.iterator();
        if (iterator.hasNext()) {
            sb.append(iterator.next()).append(",");
        }
        sb.delete(sb.length() - 1, sb.length());
        sb.append(")");
        this.preparedStatement = this.connection.prepareStatement(sb.toString());
        return this.preparedStatement.executeUpdate() == set.size();
    }

    @Override
    public Emp findById(Integer id) throws Exception {
        Emp emp = null;
        String sql = "select empno,ename,job,hiredate,sal,comm from emp where empno = ?";
        this.preparedStatement = this.connection.prepareStatement(sql);
        this.preparedStatement.setInt(1, id);
        ResultSet resultSet = this.preparedStatement.executeQuery();
        if (resultSet.next()) {
            emp = new Emp();
            emp.setEmpno(resultSet.getInt(1));
            emp.setEname(resultSet.getString(2));
            emp.setJob(resultSet.getString(3));
            emp.setHiredate(resultSet.getDate(4));
            emp.setSql(resultSet.getDouble(5));
            emp.setComn(resultSet.getDouble(6));
        }
        return emp;
    }

    @Override
    public List<Emp> findAll() throws Exception {
        return null;
    }

    @Override
    public List<Emp> findAllSSplit(
            String column, String keyWord, Integer currentPage, Integer lineSize) throws Exception {
        return null;
    }

    @Override
    public Integer getAllCount(String column, String keyWord) throws Exception {
        return null;
    }
}
