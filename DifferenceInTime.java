package com.abhishekjpaspec.criteria;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DifferenceInTime {

    public static void main(String args[]) {

        //First Date
        Date today = new Date();

        //Second Date
        Date sameDayNextMonth = new Date();
        sameDayNextMonth.setMonth(today.getMonth() + 1);

        long days = getDateDiff (today, sameDayNextMonth, TimeUnit.DAYS);
        long hours = getDateDiff (today, sameDayNextMonth, TimeUnit.HOURS);
        long minutes = getDateDiff (today, sameDayNextMonth, TimeUnit.MINUTES);
        long seconds = getDateDiff (today, sameDayNextMonth, TimeUnit.SECONDS);
        long mills = getDateDiff (today, sameDayNextMonth, TimeUnit.MILLISECONDS);
    }

    public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit)
    {
        long diffInMillies = date2.getTime() - date1.getTime();

        return timeUnit.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }
}
