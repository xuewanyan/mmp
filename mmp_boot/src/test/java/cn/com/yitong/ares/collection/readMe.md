#java 类集合框架简介
     类集产生的目的
     在所有的项目开发过程之中，都不可避免的要面对一个问题，数组长度有限。
     在Java.util包中定义的类集核心框架的组成接口有如下几种：
        ·Collection接口：它是负责保存单值的最大父接口
            -List：允许保存重复元素，数据的保存顺序就是数据的增加顺序。
            -Set：不允许保存重复元素，并且内部元素可以进行调整。
        ·Map接口：提供的就是key与value的匹配的信息；
        ·输出接口：Iterator,ListIterator,Enumeration
结论：所有的集合保存的数据的目的都是为了输出：
        ·Collection保存数据目的纯粹只是为了输出，所以最关注的就是增加数据和输出数据。
        ·Map保存数据的目的是根据key查找目的，是为了查找准备的

#===================================================================================
#List集合接口
    List子接口对于Collection子接口进行了大量的方法扩充。
        ·ArrayList
        ·Vector
#ArrayList
    ArrayList是在JDK1.2的时候推出的，可以说只要使用了List子接口，那么基本上首先ArrayList子类。
    
#Vector
    
#面试题：ArrayList。Vector的区别？
    ·发布时间，ArrayList JDK 1.2 ,Vector 1.0
    ·ArrayList 非线程安全，异步处理效率高，Vector 线程安全 效率较低
        
#LinkedList
    LinkedList是一个真正的链表实现，其功能要比ArrayList丰富，但是大部分情况下我们使用不到这个类，
    我们用到的最多的就是ArrayList。
    
#总结
    ·List子接口比Collection定义了更多的方法
    ·List子类中主要使用ArrayList子类
    
#===================================================================================
#Set集合************************
    Set也是Collection集合的一个子接口，其最主要特点是里面保存的数据不允许出现重复，但是Set子接口，
    并没有像List子接口那样，进行了扩充。而是完整的按照Collection接口的标准实现了继承。没有get（）方法。
        ·HashSet(无序)，不允许有重复元素，并且无序存放
        ·TreeSet(有序)，不允许有重复元素，有序存放
#关于TreeSet排序的说明：-------------Demo1.java
    
#关于重复元素的说明--Hashset------------Demo2.java

#总结
    ·Set的去除重复都是依靠子类来实现的，Hashset基于hashCode()、equals()，TreeSet基于Comparable接口。
    
#===================================================================================
#集合的输出方式：Iterator
    Iterator是集合输出中最为标准的接口，同时以后只要是集合的输出想都不要想，就使用Iterator输出完成。
    如果要像取得Iterator接口的实例化对象，在Collection接口中就已经明确定义了。
    定义的方法：Iterator<E> iterator()
范例： 利用迭代进行集合的输出：------------------Demo3.java
    但是在这里有个说明，在Collection接口中存在一个remove方法，而且在我们JDK1.8之中，我们发现Iterator
    也提供有remove()方法，
    删除集合中的数据不能使用集合中的remove()方法，而只能够使用Iterator接口中的remove()方法。
    
#双向迭代输出：ListIterator
    在大部分情况下，如果要进行输出操作，一定使用的是Iterator，并且基本上只输出一次，但是如果要实现双向的迭代操作，
    那么就能够利用ListIterator子接口完成。
    在进行双向迭代操作之中，必须首先执行由前向后的迭代，再执行又后到前的迭代

#枚举输出：Enumeration
    由JDK1.O提供，其主要是进行集合的输出使用的。Enumeration接口的定义接结构如下：
    Enumeration在日后的开发中有着极其重要的作用，以后也一定会使用。 
    
#foreach输出
    。。。。。。
    
#=========================================================================================
#java Map集合 具体内容查看collection包,----------2021-2-9
    Map保存的是二元偶对象。所谓的二元偶对象指的是2个值，一个是key一个value。在我们使用中可以通过key查找到
    对应的数据，就好比电话号码本一样，
    Map中有2个最为常用的子类：HashMap、Hashtable。
#HashMap
    HashMap是在JDK1.2定义的。
#Hashtable
    虽然从整体上来讲，我们都依靠Map接口出现，但是发现Hashtable集合之中key或者是value都不允许保存null
#TreeMap---------------------------Demo4.java
    key的排序一定是参照的comparable接口的执行结果。
#利用Iterator输出Map集合
    在Collection会提供有Interator实例化的方法，然而在Map没有提供，那么怎么利用Iterator实现Map输出呢？
    首先就必须要针对于我们的Map和Collection来进行比较。
    通过分析可以发现，要想利用Interator输出Map集合的数据，那么首先要解决的问题就是Map.Entry接口的定义。
    在次接口中，我们定义有如下2个重要方法，
    Map基于Iterator输出的步骤：
        · 利用Map接口中的entrySet()方法将Map集合变为Set集合。
        · Set集合中定义有Iterator接口，可以实例化
        · 利用Iterator接口迭代输出，找出每个Map.Entry接口对象，并将利用getKey(),getValue()，取出数据
范例：-------------Demo5.java

#关于key的说明------------Demo6.java
    再实际的开发之中，由于Map的核心功能就是查找，优先考虑就是Key的类型。一般都是使用String,Iteger。而这
    2个类都成功覆写hashCode()，equals()，也成功的实现了Comparable()接口。
    
    原则 ：
        1：Map接口主要进行查询使用，常用的子类为HashMap，可以保存null；
        2：Map使用Iterator输出的步骤
        2：建议使用系统类（String,Iterator）作为key的类型，不用使用自定义类作为key

#=========================================================================
#java 集合工具类 具体内容查看collection包,-----2021-2-10 
#Collections工具类
    Collections是专门为集合服务的一个工具类，它可以进行List、Set、Map等集合的一个操作。
        · 追加数据 ： public static <T> boolean addAll(Collection<? super T> c, T... elements)
#面试题
    请解释Collection和Collections的区别？
        · Collection集合操作的父接口，可以保存单值数据
        · Collections是集合的工具类,可以操作List，Map集合
#Stack子类
    Stack是栈的数据结构实现，所谓的栈是一种先进后出的数据结构，像网页的后退，文本编辑的撤销。而
    Stack是Vector的子类。
    虽然Stack是Vector的子类，但是操作的时候 需要用自己的处理方法。
 
#=========================================================================        
#java Stream数据流 具体内容查看collection包,-----2021-2-10
#Properties的使用：
    是专门负责属性信息操作的类，而且Properties属于Hashtable的子类。
    但是Hashtable可以保存任何数据类型，而Properties只能保存字符串数据类型，因为其主要是进行资源文件操作。
    但是我们需要注意的是，在使用Properties类的时候使用的是子类中定义的方法：
        ·设置属性：public Object setProperty(String key, String value)
        ·取得属性：public String getProperty(String key, String defaultValue)
  测试：---------------Demo7.java
    在Properties提供了2个重要方法：
        ·将属性输出到指定输出流中：public void store(OutputStream out, String comments)throws IOException
#总结
    当Properties与国际化程序结合的时候就会发现非常的好用，其中不要忽略了ResourceBunlde。
    
#Collection接口加强
    从JDK1.8开始由于接口上可以使用default、static定义方法了,那么再一些已有的接口中就发生了本质的改变。
    首先再Iterable接口中提供有一个：default void forEach(Consumer<? super T> action)。
  测试：---------------Demo8.java
    但是整个Collection接口之中最为重要的改变不在这里。那么在Collection的一个方法上：
        · 取得数据流对象：default Stream<E> stream()
    
#Stream操作
    之所以要取得Stream数据流，主要目的是为了进行数据处理使用。再Stream类中提供有个过略方法：
        · 过滤：Stream<T> filter(Predicate<? super T> predicate); // 断言式参数
            -必须满足某些条件之后才可以过滤
    使用map()方法处理 
    
#MapReduce
    在大数据的定义范畴之中，MapReduce属于两个层次的概念，
        ·Map处理：针对每一行数据进行处理操作；
        ·Reduce:分析统计
#范例：做一个订单处理-----Demo9.java
#范例：进行数据处理-----Demo9.java
    以上的操作有些尴尬，因为如果从数据的统计来讲，至少需要五种数据：卖出的总个数，每种商品的销售总量，
    每种商品的平均花费，卖的最好的，卖的最差的。
    看见了一堆新的类，并且这堆类还要等很久之后才能用起来或者就不用了。

#总结
    JDK1.8针对于类集提供了更多的处理支持；
    MapReduce,Map处理数据，Reduce统计数据；
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
