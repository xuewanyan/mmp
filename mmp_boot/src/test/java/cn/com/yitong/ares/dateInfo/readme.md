#java日期操作类   具体内容查看dateInfo包，-----2021-1-12
    1、Date类与long数据类型的转换
    2、SimpleDateFormat类的使用 =======核心************
    3、Calendar类的使用
    
    如果要操作日期一定要使用日期类
    
    
    // yyyy-MM-dd HH:mm:ss.SSS
    2、Date虽然可以进行日期时间的取得，但是大部分情况下这样的日期时间取得并不好用，因为它所给除的日期格式很多人看不懂，
    所以在我们的JAVA中考虑到了日期现实要求，那么我们往往最终都会按照String进行显示，如果要想实现格式化的操作，可以使用
    SimpleDateFormat类来完成。
    
#总结
    String变为基本类型，：包装类
    基本类型变为String:String.valueOf()
    Date与String转换，SimpleDateFormat
    
    Calendar类主要的功能是可以进行日期的拼凑使用，本身是抽象类，但是可以用本类中提供的一个static方法进行实例化对象的取得，
    public static Calendar getInstance()，
    
    
#总计
    ·java.util.Date代表的就是日期时间
    ·SimpleDateFormat可以实现字符串与日期间的转换操作a1a2


    