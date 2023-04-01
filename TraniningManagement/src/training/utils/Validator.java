
package training.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import training.entities.Person;


public class Validator {
    public boolean isvalidDate(int d, int m, int y) {
        if (d < 0 || d > 31 || m < 1 || m > 12 || y < 1) {
            return false;
        }
        int maxD = 31;
        if (m == 4 || m == 6 || m == 9 || m == 11) {
            maxD = 30;
        } else if (m == 2) {
            if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
                maxD = 29;
            } else {
                maxD = 28;
            }
        }
        return d < maxD;
    }
    
//    public static boolean isValidDate(int year, int month, int day)
//    {
//        return isValidDate(day + "/" + month + "/" + year, "dd/MM/yyyy") && (year < 2020 || (year == 2020 && month <= 9 && day <= 30)) ;
//    }
    
    public boolean birthDate(String birthDate) {
        int[] date = new int[3];
        int i = 0;
        try {
            for (String w : birthDate.split("/")) {
                date[i++] = Integer.parseInt(w);

            }

        } catch (Exception e) {
            return false;
        }

        return isvalidDate(date[0], date[1], date[2]);
    }
    
    public boolean isvalidMark(double mark) {
        if (mark < 0 || mark > 10) {
            return false;
        }

        return true;
    }
    
    public static boolean checkString(String s, String pattern) {
        return s.matches(pattern);
    }

    public static boolean isEmail(String email) {
        String pattern = "^[a-zA-Z]([a-zA-Z0-9_.-])+{4,31}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
        return checkString(email, pattern);
    }
    
    
}
