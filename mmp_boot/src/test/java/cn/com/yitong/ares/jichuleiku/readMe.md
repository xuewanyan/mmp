#java基础类库    具体内容查看jichuleiku包，-----2021-1-5
    ·StringBuffer类的特点
    ·StringBuffer、StringBuilder、String类之间的关系
    
  String类的特点：
        ·字符串常量就是String类的匿名对象，一旦字符串定义则不可改变
        ·String类对象可以使用直接赋值或者使用构造方法实例化，前者可以自动入池又不产生垃圾，在
    实际的开发之中，肯定都要求使用到我们的String类，可是String类有一个天生的短板：不可改变，所以
    如果要面对经常修改的环境下，我们要使用StringBuffer类。
    
    在String类中可以使用+来进行字符串的连接操作，而在StringBuffer中可以使用append()方法，
    
    1、String类与StringBuffer互转
        ·String 转StringBuffer，利用StringBuffer的构造器，
        StringBuffer bf = new StringBuffer(String str);
    2、StringBuffer 转String， 可以利用toString()方法
    
#***** 字符串反转：public StringBuffer reverse() 
#***** 删除指定范围的: public StringBuffer delete(int start,int end)

    StringBuffer是JDK1.0提供的，而在JDK1.5之后又提供了有一个StringBuilder类，这2个类但看文档都一样。
    
    
#面试题：请解释String,StringBuffer,StringBuilder类的区别
    ·String类的内容一旦生成则不可改变。StringBuffer,StringBuilder可以改变
    ·这3个都是CharSequence的子类
    ·StringBuffer是JDK1.0提供的，JDK1.5之后又提供了有一个StringBuilder，前者线程安全，后者非线程安全。
    
    
#Runtime类的设计特点；Runtime类的使用
    在每一个java进程之中都会有一个Runtime对象。由于此类对象有java对象自己维护，Runtime类设计的过程之中，只为用户
    提供了唯一的一个实例化对象，所以这个类所使用的就是单例设计模式，构造方法被私有化了。
        public static Runtime getRuntime()获取Runtime实例化对象,
        那么取得对象之后我们可以做什么呢，在Runtime类中定义有如下可以取得内存大小的方法；
        ·空闲内存大小：public long freeMemory()
        ·最大可以内存大小：public long maxMemory()
        ·总内存大小：public long totalMemory()
#面试题
    java可以调整内存大小吗？Java如何调整可以内存的大小？
        ·Java的内存划分主要有2个部分：
            ·堆内存：保存的实例化对象的内容，在每一个JVM进程之中，对象的堆内存空间都会由垃圾回收器管理内存回收问题。
            ·非堆内存（Eden + FrontSpace + To Space）：主要用于产生新的对象，
                -所有方法的全局方法区
                -所有static的全局数据区
                -永生代：负责存放反射对象的操作空间
        所有要调整内存大小，主要就是调整堆内存空间，它的调整有如下几个参数：
         ·  "-Xms" : 初始分配大小，为物理内存的1/64，最多不超过1G；
         ·  "-Xmx" : 最大的分配内存大小，为物理内存的1/4，
         ·  "-Xmn"  ： 年轻代堆内存大小。
     设置参数：java -Xms1024M -Xmx1024M -Xmn512M 工程
     
#垃圾回收
    ·新的对象保存在EDEN中，之后此对象保存在年轻代区，而后在进行GC之后，所有被保存下来的年轻代（从GC,MinorGC）中的对象将保存在旧生代(主GC,MajorGC)中，
    ·如果再有新的对象，从年轻代回收，再找旧生代，最后全部垃圾回收（FullGC）。
#面试题
    什么是GC，如何操作GC？
        ·GC指的是垃圾收集，对于GC的操作可以利用Runtime类中的gc()方法手段释放，或者利用系统自动释放；
        
#Runtime使用了单例模式，每个JVM进程只会存在一个Runtime类对象，
#Runtime类提供gc()方法，可以进行垃圾回收处理


#System类
    ·输出：SysTem.out.print()
    ·数组拷贝：SysTem.arraycopy()
        -完整定义：public static void arraycopy(Object src,int srcPos, Object dest,int destPos, int length)
        
    再System类中，public static long currentTimeMillis(),获取当前时间
    
    
#面试题
    请解释final,finally,finalize的区别？
    ·final: 定义不能够被继承的父类，不能够被子类所覆写的方法，定义常量。
    ·finally: 再异常处理中进行异常处理的统一出口。
    ·finalize : 是Object类的一个方法，是再对象回收前进行对象收尾操作。
    
#总计：
    1、System.currentTimeMills()
    2、gc()方法永远只有一个，再Runtime中定义的。
    
    
#对象克隆
        
    