package com.reservationsteps.springboot.msy.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public static Date today() {
        return new Date();
    }

    public static String todayStr() {
        return SIMPLE_DATE_FORMAT.format(today());
    }

    public static String formattedDate(Date date) {
        return date != null ? SIMPLE_DATE_FORMAT.format(date) : todayStr();
    }
}
