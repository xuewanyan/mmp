package cn.com.yitong.ares.arrayInfo;

import java.util.*;

/** 整形数组 */
public class Array {

    public Array(int len) {}

    public static void main(String[] args) {
        Integer data[] = new Integer[] {1, 2, 3, 4};
        int a = 1;
        String b = "1";
        List list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        //        System.out.println(Arrays.binarySearch(data, a));
        //        System.out.println(Arrays.asList(data).contains(a));
        //        System.out.println(list.contains(a));
        String arr[] = new String[] {"5", "1", "2", "3", "3"};
        List list1 = new ArrayList(Arrays.asList(arr));
        Set set = new HashSet(list1);
        set.remove("9");
        System.out.println(set.toString());
        String list2 = list1.toString();
        System.out.println(list2);
    }
}
