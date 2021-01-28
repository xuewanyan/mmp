#java文件操作  具体内容查看fileInfo包，-----2021-1-27
    1、File类的使用
    2、利用File类实现基本文件操作
    
#具体内容
    java.io包中保存了所有的IO操作类（原始提供的类），而再整个IO包中核心的就5个类，一个接口
        ·文件操作类：File
        ·流操作类：InputStream,OutputStream,Reader,Writer
        ·一个接口：Serializable
        
#File类的基本操作
    在整个java.io包中，File是文件本身操作有关的类，即通过使用File类可以实现文件的创建，文件的删除，目录列表的操作，
    与我们的操作内容没有任何的关系。
    如果药使用File类，那么必须准备出一个合理的路径，所以在File类的构造方法定义：
        · 设置操作文件的完整路径：public File(String pathname)，大部分都会使用此方式
        · 设置父路径与子文件：public File(File parent, String child) ，可以在安卓中使用
        
    操作File:
        ·在使用File定义路径的时候必须要考虑分隔符的问题，记住："\\"为 "\";
        ·File类中提供了以下几个基本的操作方法：
            - 创建新文件 ： public boolean createNewFile() throws IOException
                -创建成功返回true，如果文件存在则无法创建，返回false，如果文件路径出错，就抛出异常。
        ·判断路径是否存在：public boolean exists()
        ·删除路径：public boolean delete()
        
#File操作的问题
    就拿我们以上的程序来讲，会存在三个重要问题。
        #问题1：在实际的项目开发过程之中，往往都会选择在windows下做开发，而后在Linux下做部署。对于我们2个系统而言，
        最为麻烦的是路径分隔符问题。
            -windows的路径分隔符：\（反）；
            -linux的路径分隔符：/（正）；
        那么以上的程序代码，直接使用了"\\",很明显是windows，为此在实际的开发之中有个原则，不要直接使用路径分隔符。
        public static final String separator。
        
        #问题2：文件的创建会存在延迟操作
            这种延迟操作很多时候是可以忽略掉的，但是也有一点是不能忽略掉的。就是你刚刚删除了一个文件，又立刻创建了
            一个文件，就有可能出现创建不了的情况。
        #问题3：如果说现在给定的路径包含有目录，那么就无法创建，必须先存在目录后，才可以创建文件，
            · 取得父路径：public File getParentFile()
            · 创建目录：public boolean mkdir()//可以创建单个父目录，public boolean mkdirs()//可以创建多个父级目录
        在日后如果要进行文件操作的时候一定要保证文件目录首先存在。
        
#File类的其他操作 Demo2.java
    对于文件以及文件目录的操作是很多的，所以在File类里面也提供有N多个方法：
        · 判断是否为目录 ：public boolean isDirectory()
        · 判断是否为文件 ：public boolean isFile()
        · 取得文件大小 ： public long length()，文件大小以字节为单位，
        · 列出目录 : public File[] listFiles()
        
        
        
            
            
        
        