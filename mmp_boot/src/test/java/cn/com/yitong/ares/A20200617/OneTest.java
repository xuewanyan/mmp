package cn.com.yitong.ares.A20200617;

import org.apache.commons.collections4.ListUtils;

import java.util.*;
import java.util.function.BiFunction;

/**
 * 测试
 */
public class OneTest {

    AbstractAbc abc;

    public void ifelse(String str) {
        String action = ABCEnum.getFactory("A");
        System.out.println("111111111===="+action);
        try {
            abc = reflexOp.getAction(action);
        } catch (Exception e) {
            e.printStackTrace();
        }
        abc.process();


        Set set = new LinkedHashSet();
        set.add(4);

        Map map = new TreeMap(){

        };
        map.put("1","2");
    }

    public static void main(String[] args){
        OneTest t = new OneTest();
        t.ifelse("A");
    }
    public static <E> List<E> intersection(List<? extends E> list1, List<? extends E> list2) {
        List<E> result = new ArrayList();
        List<? extends E> smaller = list1;
        List<? extends E> larger = list2;
        if (list1.size() > list2.size()) {
            smaller = list2;
            larger = list1;
        }

        HashSet<E> hashSet = new HashSet(smaller);
        Iterator var6 = larger.iterator();

        while(var6.hasNext()) {
            E e = (E) var6.next();
            if (hashSet.contains(e)) {
                result.add(e);
                hashSet.remove(e);
            }
        }

        return result;
    }

}
