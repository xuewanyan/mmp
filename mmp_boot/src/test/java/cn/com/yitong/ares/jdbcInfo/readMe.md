#java数据库编程  具体内容查看jdbcInfo包，-----2021-1-25  

#介绍JDBC基本功能。
    JDBC严格来讲不是一门技术，它属于一种服务。服务的特点在于一点，所有的操作流程都是固定的。
    JDBC是java提供的数据库标准（它就是一组相关的标准接口），而不同的数据库的生产厂商要依据
    此标准进行自己的数据库操作类的具体实现提供。
    而在我们实际的项目开发过程之中，JDBC的使用一共分为三种形式：
        · JDBC-ODBC桥连接形式：利用微软提供的ODBC进行数据库的连接操作，而后JDBC访问ODBC的函数库实现数据的操作
            -流程：程序 -> JDBC -> ODBC -> 数据库；这样的操作性能很差，但是支持度是最高的，并且不需要配置任何的第三方驱动程序。     
        ·JDBC连接形式：利用不同数据库生产商提供的JDBC驱动程序进行数据库操作
            -流程：程序 -> JDBC -> 数据库 ，性能是很好的。
        ·JDBC网络连接：
            -流程：程序 -> JDBC连接协议 -> 数据库,实际使用是最多的。
        ·JDBC的协议连接：使用特定数据库生产商提供的协议标准进行数据库的操作，难度较高
    如果要进行JDBC的操作，可以使用java.sql包进行开发，包含：
        ·类 ：DriverManager类
        ·接口 ：Connection Statement PreparedStatement ResultSet
        
#总结
    JDBC一定是按照固定的代码形式来使用的。
         
         
#配置数据库的驱动程序  Demo2
    首先我们已经明确描述了JDBC的操作都说固定的流程，那么这个流程一共有如下4个步骤：
        第一步：加载数据库取得程序
        第二步：依靠DriverManager类连接数据库
        第三步：进行数据库的CRUD操作（Statement,PreparedStatement,ResultSet）
        第四步：关闭数据库连接
        
    下面按照指定的步骤来实现数据库的连接操作：
    1、配置数据库驱动程序
        本次将使用oracle数据库提供的数据库连接的支持，但是如果想要进行oracle连接，清一定要打开2个服务，一个是监听、实例服务。
        开发工具配置， 
    2、驱动加载
        所有的数据库的驱动的加载是向容器加载（每当使用java命令解释一个程序的时候，都表示启动了一个Java Application容器），利用Class.forName()进行加载，
        Oracle的驱动程序类名称：oracle.jdbc.driver.OracleDriver。
        ·如果没有配置驱动程序，则会出现找不到类的异常，
    3、连接数据库
        ·如果要进行数据库的连接操作。那么一定是使用java.sql.DriverManeger类来连接。（构造器私有化），所以如果要想操作这个类
        可以使用它的静态方法。
        ·连接数据库：public static Connection getConnection(String url, String user, String password) throws SQLException
        这个方法会返回一个Connection接口对象，每一个Connection接口对象都表示一个数据库连接。而后在getConnection（）方法里面需要有3个参数，
         ·String url ：每一个数据库的连接地址都是不同的，使用的协议也是不同的，如果是Oracle的连接。
            -标准格式：java:oracle:thin:@IP地址：端口号:mldn(数据库的SID名称)
            -连接mldn数据库: java:oracle:thin:@localhost:1521:mldn
         ·String user ： 用户名
         ·String password ：密码
    4、关闭数据库连接
        如果要关闭数据库的连接操作，那么肯定是使用Connection，
        为啥要提供一个autuCloseable的接口呢？
            只要是牵扯到资源操作，那么一定要解决的问题:必须要关闭资源，关闭资源就属于释放资源，所以提供了Autocloseable,
        但是这个接口不能用我们正常的思路调用。   
#范例：验证AutoCloseable AutoCloseDemo.java
        AutoCloseable这种形式虽然看起来是自动完成了操作，但是用的几率不高。
        
        疑问？为什么java.sql.Connection接口要通过DriverManager类打开。
        
        整个数据库对象的取得使用的设计模式就是工厂设计模式。
        
#总结
    数据库连接是进行JDBC操作的第一步，使用了工厂设计模式。
    

#利用Statement接口实现数据的CRUD操作。
    在java.sql包中Connection只是负责数据库的连接使用，它不具备数据库的操作能力，而具备数据操作能力的接口只有Statement接口。
    如果要想取得Statement接口对象可以通过Connection接口来完成。
        ·实例化Statement对象：Statement createStatement() throws SQLException，问题是如果使用的是Statement
        大部分情况下操作的都是DML，所以在我们Statement中提供了2种方法。
            ·数据更新操作：int executeUpdate(String sql) throws SQLException
                -在执行更新操作中返回的int数据是该更新影响的数据行数。
            ·数据查询此操作：ResultSet executeQuery(String sql) throws SQLException
#范例 ----Demo3
        需要提醒记住的是，在JDBC操作过程之中往往会出现2中异常，
         -java.sql.SQLException:表示的是数据库连接出错
         -java.sql.SQLSyntaxErrorException:表示的是执行SQL语句有错
    
    
#数据库的连接操作

#PreparedStatement数据库接口操作（核心***************）
    Statement存在的问题？
        Statement有一个最为严重的问题在于：所有的操作都需要使用完整的SQL语句进行，如果这个时候数据是由用户自己输入的，
        就会产生问题。
        
    PreparedStatement操作（核心）
        Statement开发中不要使用，优先使用PreparedStatement操作，这是Statement的子类。这是一个预处理的方式来进行操作。
       如果要想取得PreparedStatement的实例化对象，那么继续依靠Connection接口来实现：
                PreparedStatement prepareStatement(String sql) throws SQLException
        所谓的预处理指的是在执行sql的时候，在创建PreparedStatement接口时，而具体的内容我们使用问号 来进行占位，
        利用一系列的set来设置内容。
        
关于数据库中的日期时间描述：在程序中日期时间的描述使用的就是java.util.Date,但是在这个类下面有3个子类，
java.sql.Date,java.sql.Time,java.sql.Timestemp。
    如果要想java.util.Date变为子类的的对象，那么必须依靠Long数据类型。
    ·java.util.Date类存在有：public long getTime()
    ·java.sql.Date类的构造方法：public date(long time) 来进行互转
    
#批处理操作，事物处理控制
    所谓的批处理。指的是若干条语句将一起执行。在StateMent，PreparedStatement都有批处理。
#总结
    批处理是多条语句一起执行，JDBC事物处理只需要熟悉操作流程即可。
    事物处理的流程：
    3，conn.setAutoComit(false);设置提交方式为手工提交
    4，conn.commit()提交事务
    5，出现异常，回滚 conn.rollback();