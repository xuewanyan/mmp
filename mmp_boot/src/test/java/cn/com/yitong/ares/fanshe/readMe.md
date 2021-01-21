#java反射机制  具体内容查看fanshe包，-----2021-1-21
    既然有反，那么久有正，正常的思路中，知道一个类之后才可以产生实例化对象。
    范例：正常的操作---Demo1.java
    
    所谓的反射就是指通过对象找到来源。那么在程序中，对象要想找到它的来源，
    我们就必须依靠Object类提供的方法：public final Class<?> getClass()，不允许覆写
    通过getClass()取得类的对象，就可以找到该对象的来源。
    
#Class类对象
    Class类是反射操作的源头，也就是说所有的反射操作都应该通过Class类来完成，但是最有意思的是这个类的对象可以通过三种
    方式来实例化。
        ·利用Object类种的getClass()方法,缺点：必须有明确的实例化对象后才可以
        ·利用类.Class取得Class类的实例化操作
        ·利用Class类的static方法取得，*********最重要，******它的好处是可以直接编写字符串。
            -实例化Class对象，public static Class<?> forName(String className) throws ClassNotFoundException
        
#通过反射实例化对象（核心）
    如果要产生实例化对象，本质上讲要关键字new才可以实现，但是一切在有了反射之后改变了。
    在Class类中提供了有如下方法。public T newInstance()throws InstantiationException,IllegalAccessException
  范例：正常实例化对象
    Date date  = new Date();
  
  范例：观察自定义的实例化对象
     反射实例化对象最终也要调用无参构造方法进行实例化操作。
    
#工厂设计模式的修改（重点） 
    工厂设计模式的本质，要想取得接口的实例化对象，不应该直接使用new，而应该通过工厂取得。
    （总结：只要你自己写的接口要想获得实例化对象，99%要使用工厂。）。
    
#调用构造方法
    利用Class类中的newInstance()方法其主要目的是可以取得类的实例化对象，但是这种取得的操作本身是存在问题的，
    因为它只能够调用类中的无参构造。
    
    如果类中没有提供无参构造，那么就必须明确的调用指定的构造方法实现对象的实例化操作。首先要想实现这样的操作，
    那么必须找到类中的构造方法定义：
        public Constructor<T> getConstructor(Class<?>... parameterTypes)throws NoSuchMethodException,SecurityException
    
#调用普通方法
    类中的普通方法是在取得了本类的实例化对象之后才可以进行调用的操作。
    所有我们即便使用反射进行方法的调用，那么也必须使用newInstance()取得实例化对象，在Class类中定义有如下取得方法对象，
        ·public Method getMethod(String name, Class<?>... parameterTypes) throws NoSuchMethodException, SecurityException
        getMethod()方法返回的是Method类对象。在这么类中有一个最为重要的方法
            ·调用方法：public Object invoke(Object obj, Object... args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
    以后程序中如果给了属性名称，类的完整名称，而后可以进行自动赋值操作，那么基本就是反射机制在里面起作用。
    
#调用成员变量
    在类中的成员需要考虑两种因素：
        ·父类继承而来的成员：public Field getField(String name)
                                          throws NoSuchFieldException,
                                                 SecurityException
        ·本类定义的成员： public Field[] getDeclaredFields()
                                                                         throws SecurityException
                                                                         
    在java.lang.reflect.Field中有2个方法:
        ·取得成员内容：public Object get(Object obj)
                    throws IllegalArgumentException,
                           IllegalAccessException
                           
        ·设置成员内容：public void set(Object obj,
                                Object value)
                         throws IllegalArgumentException,
                                IllegalAccessException
                
        但是需要注意的是，几乎所有的属几乎都要使用private封装，所以要想解决封装的困扰，可以利用Filed父类的方法：
            ·取消封装：public void setAccessible(boolean flag) throws SecurityException 意思就是取消private
            
            
            
#总结
    
        
                              
                             
              