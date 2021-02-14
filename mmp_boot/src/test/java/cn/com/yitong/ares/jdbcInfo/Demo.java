package cn.com.yitong.ares.jdbcInfo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, 11);
        calendar.set(Calendar.DATE, 7);

        calendar.add(Calendar.DATE, 99);

        System.out.println(
                "增加100天后的日期："
                        + calendar.get(Calendar.YEAR)
                        + "年"
                        + calendar.get(Calendar.MONTH)
                        + "月"
                        + calendar.get(Calendar.DATE)
                        + "日");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        System.out.println(simpleDateFormat.format(date));

        long ll = date.getTime();

        System.out.println(new java.sql.Date(ll));
    }
}
