#java开发支持类库  具体内容查看taskInfo包，-----2021-1-25
    ·观察者设计模式
    ·定时调度
    ·UUID类    
    
#什么是观察者模式
    这种观察者设计模式，本身是可以通过多线程来实现的，所有在JAVA中专门提供了与观察者有关的实现类。
    :java.util.Observable、Observer（接口）
    
    首先来观察Observer接口定义：
        void update(Observable o, Object arg)； // object 追逐的数据
    如果要实现观察者的操作则还要使用Observable类。这个类中定义有如下方法。
    ：public void addObserver(Observer o) 添加观察者
    ：public void deleteObserver(Observer o) 删除观察者
    ：public void notifyObservers() 激活观察者
    ：protected void setChanged() 被观察的操作发生改变
    
    下面模拟房价的观察者操作：---Demo1.java
    
    于是在准备出观察者，观察者要关注着被观察者的变化。
    
    如果不使用以上的类或接口能否实现同样的观察者模式。所有的对象保存在一个数组里面，如果判断为成功，则执行对应操作。
    
#总结
    观察者是我们的设计模式主要介绍2个类的使用。
        
        
#定时调度 -- Demo2.java
    定时调任，没到一个时刻。自动执行。
    如果想要实现定时调度可以使用2个类：Timer,TimerTask类。
    1、Timer类
        指的是具体的调度时刻：
        ·调度：public void schedule(TimerTask task, long delay, long period) // 3个参数：调度操作类 延时开始时间 重复间隔
        ·调度：public void schedule(TimerTask task, Date firstTime, long period) // 3个参数：调度操作类 延时开始时间 重复间隔
    
    2、TimerTask类
        这个类是负责调度的具体要求：
        public abstract class TimerTask extends Object implements Runnable：
        这是一个Runnable接口的子类，在这个子类中定义有一个抽象方法：
        public abstract void run()
        定时调度的本质就是延迟+递归调用。
    定时调度不可能离开服务器的运行环境。
#总结
    在许多的互联网公司上，会经常使用定时调度操作。
    
#UUID类的作用 --- Demo3.java
    如果说现在需要随机生成一个几乎不会重复的字符串，你的首选是什么？
     · 电脑的IP地址+时间戳+任意几位的随机数+移位操作 = 几乎不会重复的数据，可是如果由用户自己
       来处理这些操作实在是过于麻烦，为了方便处理，专门提供有java.util.UUID的类，这个类可以
       生成以上格式的字符串信息。
     这个类主要使用：public static UUID randomUUID()
     几乎不会重复的。
     
 
