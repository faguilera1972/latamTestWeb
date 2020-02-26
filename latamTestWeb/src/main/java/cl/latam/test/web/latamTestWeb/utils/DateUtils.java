package cl.latam.test.web.latamTestWeb.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    public static String dateToString(Date fecha, String pattern){

        SimpleDateFormat sf = new SimpleDateFormat(pattern);
        String fechaSalida = sf.format(fecha);

        return fechaSalida;
    }

    public static Date stringToDate(String fecha, String pattern){
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        try {

            Date date = formatter.parse(fecha);
            return date;

        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

}
