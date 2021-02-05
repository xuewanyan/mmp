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
    