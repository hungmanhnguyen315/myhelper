package org.myhelper.common;

import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Formatter {
    private static Map<String, DateFormat> dateFormat;

    /**
    * @author Hung M. Nguyen
    * @since 04/09/2017
    */
    private static DateFormat getDateFormat(String pattern) {
        if (dateFormat == null)
            dateFormat = new HashMap<String, DateFormat>();

        DateFormat formatter = dateFormat.get(pattern);
        if (formatter == null) {
            formatter = new SimpleDateFormat(pattern);
            dateFormat.put(pattern, formatter);
        }

        return formatter;
    }

    /**
    * @author Hung M. Nguyen
    * @since 04/09/2017
    * @param value
    * @param pattern - The pattern describing the date and time format
    */
    public static String dateToString(Date value, String pattern) {
        return getDateFormat(pattern).format(value);
    }

    /**
    * @author Hung M. Nguyen
    * @since 04/09/2017
    * @param value
    * @param pattern - The pattern describing the date and time format
    */
    public static Date stringToDate(String value, String pattern)
        throws ParseException {
        return getDateFormat(pattern).parse(value);
    }
}