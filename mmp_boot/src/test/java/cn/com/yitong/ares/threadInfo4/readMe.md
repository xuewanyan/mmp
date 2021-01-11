#java线程生产者与消费者     具体内容查看threadInfo4包，-----2021-1-4
    现在希望实现一种数据的生产与取出的操作形式：即：有两个甚至更多的线程对象，这样的线程分为生产者线程和消费者线程，
    那么最理想的状态是生产者每生产完一条完整的数据之后，消费者就要取走这个数据，并且输出打印
    发现问题：MyThread1.java
        ·数据错误
        ·重复生产，重复取出
        
#解决数据不同步问题
    要想解决同步问题一定使用同步构造快或者同步方法，既然要同步，那么就将设置属性和取得属性的内容都同一交给Info类来完成。
    
#解决重复问题
    如果想要解决重复问题，那么就必须加入等待与唤醒的处理机制，而这样的操作方法是由Object类所提供。
    再Object类中提供了以下几种方法：
        ·等待：public final void wait() throws InterruptedException
        ·唤醒第一个等待线程：public final void notify()
        ·唤醒全部等待线程：public final void notifyAll()
    修改Info类；
    
#面试题
    请解释sleep()跟wait()的区别
    ·sleep是Thread定义的方法，再休眠到一定时间后将自己唤醒
    ·wait是Object类定义的方法，表示线程要等待执行，必须通过notify(),notifyAll()唤醒。

#总计
    生产者与消费者这是一个模型，完整的体现了线程的同步、Object类的支持。