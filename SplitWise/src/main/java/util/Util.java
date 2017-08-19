package util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Util {
    /*
    * TIDBIT
    * This is how you format dates in java from string
    * Also the format.parse returns a date object
    */
    private static final DateFormat format = new SimpleDateFormat("d/M/yyyy", Locale.ENGLISH);
    public static Date getDate(String date) throws ParseException {
        return format.parse(date);
    }

    public static int getMonth(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        // TIDBIT Calendar.MONTH is an integer. You can access it using Calendar.JULY for example
        return cal.get(Calendar.MONTH);
    }
}
