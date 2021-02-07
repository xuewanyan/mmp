#java内存流  具体内容查看liuInfo包，-----2021-2-5
#1、内存操作类 ------Demo1.java
        对于IO操作，到现在为止实际上只学习了一种文件流的操作，这种操作的特点都是需要以文件为终端进行处理的。
        但是在现在的开发中，不希望产生文件，依然需要使用IO操作，那么我们此时就可以利用内存作为操作的终端。
        在我们的JAVA中一共分为2组：
            ·字节内存流：ByteArrayInputStream 、 ByteArrayOutputStream
            ·字符内存流： CharArrayReader、CharArrayWriter
        本次使用的是字节内存流，同时需要做一个说明：
            ·以文件操作为例，以文件为终端
                -程序 》OutputStream 》 文件
                -程序 《 InputStream 《 文件
            ·以内存操作为例，以内存作为终端；
                -程序 》 InputStream 》 内存
                -程序 《 OutputStream 《 内存
#2、正常来讲肯定是子类为父类进行实例化，但是所有的子类都是有自己方法扩充的。-------Demo2.java
    在ByteArrayOutputStream中提供有一个public byte[] toByteArray()，
    讲全部保存在内存输出中的字节全部取出变为数组保存。
    下面操作实现2个文件的合并：
    
    
#总结
    内存也可以作为IO操作。
  
#=========================================================================================    
    
#java打印流  具体内容查看liuInfo包，-----2021-2-5 （**********） ----Demo3.java
    1、分析打印流的产生与设计思想
    2、观察JDK1.5后打印流的新支持
    如果要进行数据的输入InputStream，数据的输出OutputStream，可是在现实中会有个问题：
    InputStream，OutputStream只能够受限于字节数组类型byte[],但是本次先来解决输出流的问题。
    设计一个类，这个类可以实现String、int、double数据的输出。
    
#打印流
    再java.io中提供了两个打印流：PtintStream(字节打印流),PrintWriter(字符打印流)。下面来观察这2个打印流的继承结构
    以及构造方法。
        这种涉及结构非常类似于代理设计模式，但是与代理设计模式有两点差别：
            ·代理设计模式必须以接口设计为主；
            ·代理设计模式执行的时候调用的依然是父类接口中定义的方法；
总结：
    如果以后需要进行内容的输出操作，那么使用最方便的一定是打印流，再以后的开发之中，如果程序要输出文字
    信息就使用打印流。

#JDK1.5后的新支持
    ·格式化输出：public PrintStream printf(String format, Object... args)
    
#总结
    打印流使用的是装饰模式，加强OutputStream的功能。
    打印流可以替代OutputStream实现数据的输出操作。
    
#=========================================================================================  
#java System类怼IO的支持  具体内容查看liuInfo包，-----2021-2-7
    Syetem.in指的是通过标准输入设备进行输入，而标准输入设备指的就是键盘，而Syetem.in类型是InputStream
范例：实现键盘输入数据---------------Demo4.java
    
#========================================================================================= 
#java IO高级应用  具体内容查看liuInfo包，-----2021-2-7
    在JDK1.5之前，BufferedReader是一个非常重要的数据读取的操作类，也就是说如果要进行输入流的操作，
    尤其是文字操作，都建议使用此类。
    BufferedReader类属于Reader的子类，负责进行缓冲区读取，由于其本身属于字符输入流，所以更加适合于
    输入中文文字信息。
    下面我们来观察BufferedReader的继承结构。
        ·构造方法：public BufferedReader(Reader in)
        ·读取方法:public String readLine() throws IOException  // 直接返回String类型
 范例：使用BufferedReader实现数据输入；-------Demo5.java
    BufferedReader使用的缓冲区
    
#Scanner----------------------------------Demo6.java
    从JDK1.5之后，提供了一个java.util.Scanner类。而我们Scanner称为扫描流，首先需要观察的是类的继承结构，构造方法：
        ·Scanner(InputStream source)
    当取得了Scanner的实例化对象之后，那么就可以进行数据的读取操作
        ·判断是否有输入数据：public boolean hasNext()
        ·取出数据：public String next()
    Scanner类中默认最古老的支持就是利用String来接收数据，可是很多时候这样的操作可能并不方便，因为我们输入的内容
    可能是数字，或者我们输入的内容还需要进行验证。那么这样的情况下，Scanner类发生了变化，增加了一堆方法，hasNext，next；
    通常情况下Scanner会将空格和换行作为读取分隔符，所以想要改变：
        ·设置分隔符：public Scanner useDelimiter(String pattern)
    Scanner本身支持各种数据类型：
    Scanner读取操作比InputStream容易，比BufferedReader类的实例化简单
#总结
    程序输出信息使用PrintStream(PrintWriter),而程序输入数据使用Scanner(BufferedReader)
        