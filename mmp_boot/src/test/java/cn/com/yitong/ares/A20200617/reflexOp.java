package cn.com.yitong.ares.A20200617;

/**
 * 反射工具类
 */
public class reflexOp {

    /**
     * 返回类实例
     * @param id
     * @return
     * @throws Exception
     */
    public static AbstractAbc getAction(String id) throws Exception {
        return (AbstractAbc) Class.forName(id).newInstance();
    }
}
