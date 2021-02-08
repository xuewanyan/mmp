#java 对象序列化  具体内容查看serion包，-----2021-2-8
    对象序列化指的是将内存中保存的对象变成二进制数据流，这就意味着我们的对象可以保存再文件中，
    或者进行各种传输操作。但是并不是所有的类对象都可以被序列化，如果某个类的对象需要被序列化，
    则这个类必须实现java.io.Serializable接口。但是这个接口并没有任何的方法定义，以为其描述
    的是一个能力，属于标识接口。
范例：定义可以被序列化的类---------------Demo1.java
    以后Person的对象就可以被传输或保存再对象之中了。
    
    
#序列化操作
    如果要进行序列化操作，那么必须依靠java.io.ObjectOutputStream类。
        ·构造方法：public ObjectInputStream(InputStream in) throws IOException
    当取得了ObjectOutputStream类的实例化对象之后就可以实现序列化操作了。
        ·输出对象：public final void writeObject(Object obj)throws IOException
    这种序列化代码是固定的，所以这样的开发操作都不需要开发者自己进行处理。
范例：---------------Demo1.java

#反序列化
    利用ObjectOutputStream输出的文件信息是二进制数据。看不懂。还原需要ObjectInputStream类进行反序列化操作。
        ·构造方法：public ObjectInputStream(InputStream in) throws IOException
    当去了对象之后，可以利用如下方法进行反序列化：
        ·读取方法：public final Object readObject() throws IOException, ClassNotFoundException
范例：---------------Demo1.java

#transient
    默认情况下一个对象中的所有属性都一定要被序列化下来，那么如果希望某些属性不被序列化下来，那么可以使用关键字transient。
    
    
#总结
    用户只关心的只有java.io.Serializable接口，transient虽然可以保证属性不被序列化，但是很少出现。
    
    
    
    