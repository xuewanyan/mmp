#-----------------------继承性--------------
#继承是面向对象中第二大主要特点，其核心性质：可以将父类功能一直延续下去。
#为什么需要有继承？
   #具体展示如下：
   
#使用继承解决问题，实现父类代码的重用问题，程序中可以使用extends
       #子类：也被称为派生类
       #extends:虽然从本质上将属于继承概念，但其翻译为拓展，扩充的意思
       #父类：本质上在Java中被称为超类（Super Class）
       
#继承的使用限制
        #限制一：Java不允许多重继承，也就是说一个子类只能继承一个父类，但是可以多层继承，A继承B,B继承C，C继承D。。。。
        #因为C++支持多继承，。。。。。。 
        #限制二：子类在继承父类后会将父类的全部结构继承下来，但是对于私有操作属于隐式继承，而所有的非私有操作属于显示继承，父类私有属性无法直接访问
        #限制三：在实例化子类对象时会默认调用子类的无参构造方法，但是在执行子类构造前会首先自动实例化父类构造，
                为父类的对象实例化，也就是说父类对象永远早于子类对象的实例化。