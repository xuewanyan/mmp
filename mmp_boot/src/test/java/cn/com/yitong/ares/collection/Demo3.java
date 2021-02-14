package cn.com.yitong.ares.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** 迭代输出集合 */
public class Demo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        final List<String> list2 = new ArrayList(list);

        Iterator<String> interator = list.iterator();
        while (interator.hasNext()) {
            System.out.println(list2);
            String str = interator.next();
            if ("b".equals(str)) {
                //                list2.remove(str);
                interator.remove();
            } else {
                System.out.println(str);
            }
        }
        System.out.println(list2);
    }
}
