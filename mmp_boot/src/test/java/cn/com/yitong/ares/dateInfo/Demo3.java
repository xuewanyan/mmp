package cn.com.yitong.ares.dateInfo;

import java.util.Calendar;

/** Calendar */
public class Demo3 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(calendar.get(Calendar.YEAR)).append("年");
        stringBuffer.append(calendar.get(Calendar.MONTH) + 1).append("月");
        stringBuffer.append(calendar.get(Calendar.DAY_OF_MONTH)).append("日");

        System.out.println(stringBuffer);
    }
}
