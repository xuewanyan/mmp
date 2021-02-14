package cn.com.yitong.ares.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/** Map的迭代输出 */
public class Demo5 {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap();
        map.put("t", "1");
        map.put("r", "2");
        map.put("y", "3");
        map.put("g", "4");

        Set<Map.Entry<String, Object>> set = map.entrySet();
        Iterator<Map.Entry<String, Object>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Object> map1 = iterator.next();
            String key = map1.getKey();
            String val = map1.getValue().toString();
        }
    }
}
