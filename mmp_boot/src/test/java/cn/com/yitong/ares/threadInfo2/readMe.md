#线程的常用操作方法 *****
    线程的命名、线程的休眠、线程的优先级。
        线程的所有操作方法几乎都在Thread类种定义好了。
#线程的命名与取得
    从本质上讲多线程的运行状态并不说固定的，所以来讲要想确定线程的执行，唯一的区别就在于线程的名称上。
    在取名的时候就应该避免重名，或者避免修改名称。
    在Thread类种有如下的几个方法可以实现线程名称的操作：
        ·构造方法：Thread(Runnable target, String name)
        ·设置名称：public final void setName(String name)
        ·取得名称：public final String getName()
    既然我们线程本身是不确定的状态，所以要取得线程名称的话，那么唯一能做的就是取得当前执行的线程的名字。
    所以在Thread类中提供有这样的方法：public static Thread currentThread()
        #观察以下代码：MyThread1.java
    线程的命名与取得：
        如果在设置线程对象没有设置具体的名字，那么就采用一个默认的名字进行定义。
        #观察以下代码： 
        //name = main
        // name = Thread-0
        线程一定是依附于进程来实现的，但是现在进程在哪里呢？
        每当使用java命令在JVM上解释某一个程序执行的时候，那么都会默认启动一个JVM的进程，而主方法只是这个进程
        中的线程，所以整个程序一直都跑在线程的运行机制上。
        每个JVM至少会启动两个线程： 主线程（main），GC线程。

#线程休眠
    如果想让某些线程延缓执行，那么就可以使用休眠的方式进行处理，在我们Thread类里面提供了休眠方法。public static void sleep(long millis) throws InterruptedException
    如果休眠的时间没到就中断休眠，那么就会产生中断异常。
    #观察休眠：MyThread3.java
    以上的代码中我们感觉像是所有的线程都对象都同时休眠了，但是严格来讲同时是有先后顺序的，但是这个顺序小一点而已。

#线程的优先级
    从理论上来讲，优先级越高的线程越有可能先执行。而在我们Thread类里面，定义有以下几个优先级方法。
        ·设置优先级：public final void setPriority(int newPriority)
        ·取得优先级：public final int getPriority()
    而对于我们优先级，我们一共定义有三种优先级：
        ·最高优先级：public static final int MAX_PRIORITY     值10
        ·中等优先级：public static final int NORM_PRIORITY    值1
        ·最低优先级：public static final int MIN_PRIORITY     值5
    主线程的优先级是什么呢：
        Thread.currentThread().getPriority()
        可以发现主线程是属于一半优先级，中等；
        
#总结
    1、线程要有名字：Thread.currentThread取得当前线程
    2、线程的休眠有先后顺序，
    3、理论上线程的优先级越高越有可能先执行，不是一定滴。
        