package org.myhelper.common;

import java.util.Date;
import java.util.Map;
import java.util.HashMap;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
*
*
* @author Hung M. Nguyen
* @since 04/09/2017
*/
public class Formatter {
    private static Map<String, DateFormat> dateFormat;

    /**
    * Get (create if not exist) an object implemented DateFormat interface
    * with you pattern
    *
    * @author Hung M. Nguyen
    * @since 04/09/2017
    * @return An object implemented DateFormat interface with your pattern
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
    * Convert date to string by your pattern
    *
    * @author Hung M. Nguyen
    * @since 04/09/2017
    * @param value
    * @param pattern - The pattern describing the date and time format
    */
    public static String dateToString(Date value, String pattern) {
        return getDateFormat(pattern).format(value);
    }

    /**
    * Convert string to date by your pattern
    *
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