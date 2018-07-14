package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtilDate {
    public static String getTodayDate(String pattern){
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        Date todayDate = new Date();
        return dateFormat.format(todayDate);
    }

    public static String getDateAddDays(String pattern, int daysToAdd){
        DateFormat dateFormat = new SimpleDateFormat(pattern);
        Date todayDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(todayDate);
        calendar.add(Calendar.DATE, daysToAdd);
        return dateFormat.format(calendar.getTime());
    }


}
