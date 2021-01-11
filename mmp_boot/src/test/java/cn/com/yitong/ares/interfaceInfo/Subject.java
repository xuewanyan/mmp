package cn.com.yitong.ares.interfaceInfo;

/**
 * 核心主题操作
 */
public interface Subject {

    public void get();
}

class RealSubbect implements Subject{

    @Override
    public void get() {
        System.out.println("取回了=====");
    }
}

class ProxySubject implements Subject{

    private Subject subject;//代理的真是主题

    public ProxySubject(Subject subject){
        this.subject = subject;
    }

    public void prepare(){
        System.out.println("追债准备");
    }
    @Override
    public void get() {
        this.prepare();
        this.subject.get();
        this.end();
    }

    public void end(){
        System.out.println("追债结束");
    }

    public static void main(String[] args) {
        Subject subject = new ProxySubject(new RealSubbect());
        subject.get();
    }
}