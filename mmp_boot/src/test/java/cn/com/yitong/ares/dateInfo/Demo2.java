package cn.com.yitong.ares.dateInfo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/** SimpleDateFormat */
public class Demo2 {
    public static void main(String[] args) {

        // 将日期转换为字符串
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println(simpleDateFormat.format(date));

        // 将字符串转换为时间Date
        String str = "1992-12-22 12:22:22.11";
        try {
            Date date1 = simpleDateFormat.parse(str);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
