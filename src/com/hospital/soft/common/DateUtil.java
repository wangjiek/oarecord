package com.hospital.soft.common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {


    public static String getToday() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }

    public static String parseDateToString(Date d, String fmt) {
        if (d == null) {
            return "";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(fmt);
        return sdf.format(d);
    }

    public static Date parseStringToDate(String s, String fmt) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(fmt);
            return sdf.parse(s);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date DateAdd(Date d, int min) {
        try {

            return new Date(d.getTime() + min * 60000L);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Date DateAdd(int min) {
        return DateAdd(new Date(), min);
    }

    public static String getWeekOfDate(Date dt) {
        String[] weekDays = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }

    public static String getWeekOfDate2(Date dt) {
        String[] weekDays = {"周天", "周一", "周二", "周三", "周四", "周五", "周六"};
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return weekDays[w];
    }

}
