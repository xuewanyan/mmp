#java字节流与字符流  具体内容查看fileInput包，-----2021-2-4
    1、利用字节流与字符流实现数据操作   
        #如果要进行文件内容的操作，必须依靠数据流来完成，而数据流主要分为2种：
            · 字节流 ：InputStream(字节输入流),OutputStream(字节输出流)
            · 字符流 ：Reader(字符输入流)，Writer(字符输出流)
        流：
        #流在现实中也是存在的,例如：水流，电流。就以居民水库用水的概念来观察流的操作：
            ·按照字节流的方式描述：输入>>终端；终端>>>>输出>>>外界
            ·按照字符流的操作方式：输入>>>字符加工>>>终端；终端>>>>字符加工>>>输出>>外界
            #所以，字符要比字节处理的更多一些，但是不管使用的是字节流还是字符流，其基本操作流程都是一样的，
        以文件操作为例：
            ·创建File类对象，主要是指明要操作的文件路径
            ·通过字节流或字符流的子类为父类实例化
            ·进行文件的读，写操作
            ·关闭数据流
            
#字节输出流--------Demo1.java
    字节输出流主要是以操作byte数据为主的，首先来观察java.io.OutputStream类的定义结构：
    public abstract class OutputStream extends Object implements Closeable, Flushable
    最早在使用OutputStream的时候，还没有Closeable，Flushable，所以这2个接口基本可以忽略了。
    而除了我们close(),flush()之外，还定义有3个输出操作方法。
    ·输出单个字节：public abstract void write(int b) throws IOException
    ·输出全部字节数组：public void write(byte[] b) throws IOException
    ·输出部分字节数组：public void write(byte[] b, int off, int len) throws IOException （最重要）
    但是OutputStream是一个抽象类，那么按照抽象类的基本原则，如果要取得OutPutStream的实例化对象，那么
    一定要依靠子类，如果要进行文件的操作，则可以使用，FileOutputStream.java,在这个类中提供有2个常用构造
    ·覆盖文件：public FileOutputStream(File file) throws FileNotFoundException
    ·追加文件：public FileOutputStream(File file, boolean append)throws FileNotFoundException
    
#范例：实现文件的输出--------Demo1.java

#字节输入流：InputStream---------Demo2.java
    InputStream可以实现数据的读取操作，在Java中InputStream的定义如下：
    public abstract class InputStream extends Object implements Closeable
    在InputStream定义了3个读取的方法：
        ·读取单个字节：public abstract int read()throws IOException
            -每次执行此方法将读取单个字节数据，如果已经读取完成了，那么返回-1
        ·读取数据到字节数组中：public int read(byte[] b)throws IOException
            -每次将数据读取到数组之中，那么会返回读取长度的数据，如果没有数据则返回长度为-1，
            -要读取的内容，大于开辟数组的内容，长度就是整个数组的长度
            -要读取的内容，小于开辟数组的内容，长度就是全部最后的长度，数组装不满。
        ·读取部分内容到字节数组中：public int read(byte[] b, int off, int len) throws IOException
            -每次读取内容到部分字节数组，只允许读取满整个限制的数组的字节个数。此方法以为会返回读取的长度。
    InputStream是一个抽象类，所以要读取文件需要使用FileInputStream子类进行，定义了构造方法如下：
        ·构造方法：public FileInputStream(File file) throws FileNotFoundException
        再InputStream种提供一个read方法，可以实现单个字节的读取：
        
#字符输出流Writer------------Demo3.java
    Writer是进行字符输出操作的使用的类，这个类属于抽象类，观察定义：
    public abstract class Writer extends Object implements Appendable, Closeable, Flushable
        ·可以直接输出字符串：public void write(String str) throws IOException
#范例：
#虽然Writer提供了字符数组的能力，但是使用就是为了直接字符串的直接输出。
#字符流是最适合操作中文，但并不意味着字节流就无法操作中文。

#字符输入流Rewder--------------Demo4.java
    public abstract class Reader extends Object implements Readable, Closeable
    ·数据读取：public int read(char[] cbuf) throws IOException
    
    Reader 与InputStream,除了数据类型有差异之外，操作上没有优势
    
#字节流与字符流的区别
    这两种流的区别就好比数据库种的BLOB,CLOB的区别？
        · CLOB：保存大文本数据
        · BLOB：保存二进制数据，例如图片，文字，字节数据
    首先要明确一点，任务终端(网络，文件)读取或输出的数据都一定是字节，但是字符是经过内存处理过的数据，
        ·字符输入：字节（磁盘），自动转换为字符（内存）
        ·字符输出：字符（内存），自动转换为字节（磁盘）
    在我们利用字符流输出的时候，所以的内容实际都只输出到了缓冲区（内存）。在使用close()关闭的时候，
    会将缓冲区的数据进行输出，如果没有关闭，那么就将无法输出，此时可以利用flush()进行强制刷新。
    字符使用了缓冲区，而字节没有缓冲区
    如果处理中文使用字符流，其他使用字节流。

#观察转换流的使用-----Demo5.java
    在我们现在给出的字节流与字符流的操作之中，可以发现各有特点，为此java提供了2个类：
        InputStreamReader,OutStreamWriter.
    观察者2各类的构造方法：
    InputStreamReader ：public InputStreamReader(InputStream in)
    OutStreamWriter ：public OutputStreamWriter(OutputStream out)
    也就是说利用InputStreamReader可以接收InputStream对象，然后向上转型为Reader类对象。
    
总结：
    字节流与字符流之间是可以实现互相转换的，字符流一定是在内存中经过处理得来的结果。
    
#文件拷贝--------Demo6.java
    编写
    
        
    