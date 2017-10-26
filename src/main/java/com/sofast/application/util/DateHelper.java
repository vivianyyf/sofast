package com.sofast.application.util;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/*
 *
 * @author fjiang
 * @description 
 * @date 7/25/16
 */
public class DateHelper {
    public static Date NowAddSeconds(int minus) {
        DateTime dateTime = new DateTime();
        return dateTime.plusSeconds(minus).toDate();
    }

    public static Date getBirthDay(String birthDayStr) {
        DateTime dt = DateTime.parse(birthDayStr);
        return dt.toDate();
    }

    public static String formatDate(Date birthDay) {
        if (birthDay != null) {
            DateTime dt = new DateTime(birthDay);
            DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy/MM/dd");
            return dt.toString(fmt);
        } else {
            return "";
        }
    }

    public static String formatUSDate(Date birthDay) {
        if (birthDay != null) {
            DateTime dt = new DateTime(birthDay);
            DateTimeFormatter fmt = DateTimeFormat.forPattern("MM/dd/yyyy");
            return dt.toString(fmt);
        } else {
            return "";
        }
    }
}
