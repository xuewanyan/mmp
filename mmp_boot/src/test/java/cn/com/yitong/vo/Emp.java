package cn.com.yitong.vo;

import java.io.Serializable;
import java.util.Date;

public class Emp implements Serializable {
    private Integer empno;
    private String ename;
    private String job;
    private Date hiredate;
    private Double sal;
    private Double comn;

    public Emp() {}

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Double getSql() {
        return sal;
    }

    public void setSql(Double sal) {
        this.sal = sal;
    }

    public Double getComn() {
        return comn;
    }

    public void setComn(Double comn) {
        this.comn = comn;
    }
}
