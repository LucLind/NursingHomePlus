package utils;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *  Utility class, providing Methods for converting Strings into LocalTim/Date objects.
 */
public class DateConverter {
    /**
     * Converts a String into a LocalDate object
     * @param date The String thats representing a date (YYYY-MM-DD).
     * @return
     */
    public static LocalDate convertStringToLocalDate(String date) {
        String[] array = date.split("-");
        LocalDate result = LocalDate.of(Integer.parseInt(array[0]), Integer.parseInt(array[1]),
                Integer.parseInt(array[2]));
        return result;
    }

    /**
     * Converts a String into a LocalTime object
     * @param time The String thats representing a time (HH:mm).
     * @return
     */
    public static LocalTime convertStringToLocalTime(String time) {
        String[] array = time.split(":");
        LocalTime result = LocalTime.of(Integer.parseInt(array[0]), Integer.parseInt(array[1]));
        return result;
    }
}
