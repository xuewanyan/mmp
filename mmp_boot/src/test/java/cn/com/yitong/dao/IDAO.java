package cn.com.yitong.dao;

import java.util.List;
import java.util.Set;

/**
 * 范型公共类
 *
 * @param <K> 要操作的主键类型
 * @param <V> 要操作的VO类型
 */
public interface IDAO<K, V> {
    /**
     * 描述了增加操作，执行insert语句
     *
     * @param vo 包含了要增加的数据信息
     * @return 如果数据增加成功返回true，否则返回false
     * @throws Exception
     */
    public boolean doCreate(V vo) throws Exception;

    /**
     * 执行更新操作，执行Update语句
     *
     * @param vo 包含了要增加的数据信息
     * @return 如果数据更新成功返回true，否则返回false
     * @throws Exception
     */
    public boolean doUpdate(V vo) throws Exception;

    /**
     * 数据的删除操作，需要在执行前根据删除的编号，拼凑出SQL语句
     *
     * @param set 所有要删除数据的编号
     * @return 如果数据删除成功返回true，否则返回false
     * @throws Exception
     */
    public boolean doRemove(Set<K> set) throws Exception;

    /**
     * 根据雇员编号查询出雇员的完整信息，并且将返回结果集填充到VO对象之中
     *
     * @param id 要查询的数据编号
     * @return 如果查询到则将内容以VO对象返回，如果没有返回null
     * @throws Exception
     */
    public V findById(K id) throws Exception;

    /**
     * 查询数据表中的全部数据，每行数据通过VO类包装，然后通过List返回
     *
     * @return
     * @throws Exception
     */
    public List<V> findAll() throws Exception;

    /**
     * 分页进行数据表的模糊查询
     *
     * @param column 要模糊查询的数据列
     * @param keyWord 要进行查询的关键字
     * @param currentPage 当前所在页
     * @param lineSize 每页显示的数据行数
     * @return
     * @throws Exception
     */
    public List<V> findAllSSplit(
            String column, String keyWord, Integer currentPage, Integer lineSize) throws Exception;

    /**
     * 使用COUNT()函数统计数据表中符合查询要求的数据量
     *
     * @param column 要模糊查询的数据列
     * @param keyWord 要进行查询的关键字
     * @return 返回COUNT()的统计结果，如果没有数据就返回0
     * @throws Exception
     */
    public K getAllCount(String column, String keyWord) throws Exception;
}
