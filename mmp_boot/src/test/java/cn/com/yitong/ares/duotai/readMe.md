#-------多态-----------重要

#在java中多态性主要由两个方面组成：
    ·方法的多态性
        -方法重载：方法调用时可以根据不同的参数个数以及类型可以实现不同的功能；
        -方法的覆写：不同的子类针对同样的方法可以有不同的实现
    ·对象的多态性：父类与子类对象间的转换操作；
        -对象的向上转型：父类 父类对象 = 子类实例，自动完成
        -对象的向下转型：子类 子类对象 = （子类）父类实例，强制转型
#分析向上转型的意义
    现在要求定义一个fun()方法，这个方法要求可以接收A 以及所有子类的实例化对象，于是根据这样的描述，我们可以有2种实现方案
    方案1：使用方法重载的概念来完成，方法重载太多了，不好。
    方案2：发现所有的方法调用相同，那么可以利用对象自动向上转型的概率，之间使用A类接收。
    
#向下转型的意义
    一旦发生了向上转型，父类对象是不可能调用子类中新建的方法的，只能够调用父类子类本身所定义的方法名称，也就是说向上转型之后牺牲的是子类的个性化特征（子类的自定义方法 父类没有的方法）。
    但是如果说现在想要调用子类的特殊方法，那么就必须采用向下转型。
#解释：为什么代码里面需要先向上转型，再进行向下转型呢，啰嗦。


#总结
    向上转型：为了实现参数的统一，但是向上转型一定要与方法覆写产生关联。
    向下转型：为了调用子类特殊的方法实现，但是向下转型前首先要发生向上转型，但是可能会存在安全隐患，可以使用instanceof进行判断，但是不推荐这样使用。
    不转型：为了方便操作直接使用系统类或者一些功能类，例如：String,
    