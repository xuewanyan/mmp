package cn.com.yitong.ares.collection;

import java.util.*;

/** 迭代输出集合 */
public class Demo3 {
    public static void main(String[] args) {
        List<Map<String, Object>> list = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("a", "11");
        map.put("b", "22");
        map.put("c", "33");
        list.add(map);
        Map<String, Object> map1 = new HashMap<>();
        map1.put("a", "44");
        map1.put("b", "55");
        map1.put("c", "66");
        list.add(map1);
        Map<String, Object> map2 = new HashMap<>();
        map2.put("a", "77");
        map2.put("b", "88");
        map2.put("c", "99");
        list.add(map2);
        Map<String, Object> map3 = new HashMap<>();
        map3.put("a", "111");
        map3.put("b", "222");
        map3.put("c", "333");
        list.add(map3);

        final List<String> list2 = new ArrayList(list);

        Iterator<Map<String, Object>> interator = list.iterator();
        System.out.println(interator.toString());
        int i = 0;
        while (interator.hasNext()) {
            Map map11 = interator.next();
            i++;
            System.out.println(map11.get("a"));
            if ("77".equals(map11.get("a"))) {
                interator.remove();
                System.out.println("aaa:" + map11);
                list2.remove(map11);
            }
        }
        System.out.println(list2);
        System.out.println(i);
    }
}
