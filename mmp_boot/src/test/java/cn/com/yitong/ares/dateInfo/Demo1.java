package cn.com.yitong.ares.dateInfo;

import java.util.Date;

/** date */
public class Demo1 {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.getTime()); // 日期转long
        System.out.println(date);
    }
}
