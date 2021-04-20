package cn.com.yitong.ares.dateInfo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/** Calendar */
public class Demo3 {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(calendar.get(Calendar.YEAR)).append("年");
        stringBuffer.append(calendar.get(Calendar.MONTH) + 1).append("月");
        stringBuffer.append(calendar.get(Calendar.DAY_OF_MONTH)).append("日");

        stringBuffer.append(calendar.get(Calendar.HOUR_OF_DAY)).append(".");
        stringBuffer.append(calendar.get(Calendar.MINUTE)).append(".");
        stringBuffer.append(calendar.get(Calendar.SECOND));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ddHH.mm.ss");
        Date start = sdf.parse("2021-04-1209.15.00");
        Date end = sdf.parse("2021-04-1212.00.00");

        System.out.println(compareto(start, end, new Date()));
    }

    /**
     * @param start
     * @param end
     * @param nowDate
     */
    public static boolean compareto(Date start, Date end, Date nowDate) {
        if (start.getTime() == nowDate.getTime() || end.getTime() == nowDate.getTime()) {
            return true;
        }
        System.out.println(nowDate.before(end));
        System.out.println(nowDate.after(start));
        return nowDate.before(end) && nowDate.after(start);
    }
}
