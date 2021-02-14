package cn.com.yitong.ares.collection;

import java.util.Map;
import java.util.TreeMap;

/** TreeMap */
public class Demo4 {
    public static void main(String[] args) {
        Map<String, Object> map = new TreeMap();
        map.put("GG", 2);
        map.put("CG", 2);
        map.put("DG", 2);
        map.put("TG", 2);

        System.out.println(map);
    }
}
