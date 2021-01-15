#比较器
    ·数组操作类：Arrays
    ·Comparable接口
    ·二叉树实现
    ·Comparator接口
    
    
#-------------------------------------------
    1、数组的操作类，Arrays
        最早就在使用了，使用的它的排序操作，
        ·二分查找，
    总结：数据的操作，熟悉Arrays类就行，里面应有尽有。
    
    
    2、比较器：Comparable接口（核心）
        在Arrays类中提供有一个方法：public static void sort(Object[] a)，此方法直接针对于对象数组进行排序操作，
        直接操作对象会报错：
        Exception in thread "main" java.lang.ClassCastException:
         cn.com.yitong.ares.compareInfo.Person cannot be cast to java.lang.Comparable
      之所以造成这样的问题，是因为如果要进行对象数组的排序，我们必须要解决数据的大小关系问题，然而对象无法区分出大小关系。
      为了解决这一个问题，java会自动在排序的时候将所有的对象强制转换为Comparable接口对象，如果要想实现对象数组的排序。
      那么对象必须要实现Comparable接口。
      Interface Comparable<T>{
        int compareTo(T o)  
      }
      
     总结：对象的比较一定要用Comparable;
     
     
     3、二叉树算法（Binary Tree 、BT）
        二叉树也好，链表也好，本质是一样的，目的是保存多个数据，实现动态的对象数组，所有的数据结构都一定有一个前提，
        必须通过节点进行数据的包裹，目的是确定先后顺序。那么我们现在也可以对我们的node进行修改，让其保存对象（Object、Comparable）
       但是我们每个节点上要保留2个节点：左子树，右子树
       保存的原则：比根节点小的数据放在左子树，比根节点大的数据保存在右子树。
       
       
#请解释2种比较器的区别
    ·在进行对象数组排序的过程之中需要使用到比较器，比较器有两个：Comparable,Compartor (都是接口)
    ·java.lang.Comparable:是在类定义的时候默认实现好的接口，里面提供有一个compareTo()的方法用于大小比较
    ·java.util.Comparator:需要单独定义一个排序的比较规则类，里面有2个方法，compare(),equals()
    
     