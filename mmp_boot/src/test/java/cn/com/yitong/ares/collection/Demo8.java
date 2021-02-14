package cn.com.yitong.ares.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/** Collection加强 */
public class Demo8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("ff");
        list.add("rr");
        list.add("hh");
        list.add("qq");
        //        list.forEach(System.out::println);
        //        Stream<String> stream = list.stream();

        // 新增过滤
        Stream<String> stream = list.stream();

        System.out.println(stream.count());
    }
}
