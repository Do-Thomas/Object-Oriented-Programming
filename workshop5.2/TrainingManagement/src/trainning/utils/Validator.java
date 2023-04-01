package trainning.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Validator {

    private static Scanner sc = new Scanner(System.in);

//    public static boolean isBirthdate(String dob) {
////        boolean valid = true;
////        int birth;
////        do {            
////            System.out.println("Enter birth date: ");
////            birth = sc.nextInt();
////            valid = birth.
////        } while (!valid);
//        
//        String regex = "^(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])/[0-9]{4}$";
//        boolean result = dob.matches(regex);
//        if (result) {
//            System.out.println("Given date of birth is valid");
//        } else {
//            System.out.println("Given date of birth is not valid");
//        }
//        return checkString(dob, regex);
//    }
    public static boolean isValidDate(int year, int month, int day)
    {
        return isValidDate(day + "/" + month + "/" + year, "dd/MM/yyyy") && (year < 2020 || (year == 2020 && month <= 9 && day <= 30)) ;
    }
    
    public static boolean isValidDate(String date, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date.trim());
        } catch (ParseException pe) {
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

//    public static boolean isPhone(String phone) {
//        return checkString(phone, "[\\d]{10,12}");
//    }
    public static boolean checkSScore(double theory, double pactice) {
        if (theory < 0 || theory > 10 || pactice < 0 || theory > 10) {
            return false;
        } else {
            return true;
        }
    }
    
    public static boolean isEmptyString(String s) {
        return s.trim().isEmpty();
    }
    public static boolean checkEqualString(String s, String x) {
        return s.equals(x);
    }

    public static boolean isGender(String gender) {
        return gender.toLowerCase().matches("m|f|male|female");
    }
     public static String convertGender(String gender) {
        if (isGender(gender)) {
            if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("m"))
                return "m";
            else if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("f"))
                return "f";
        }
        return "";
    }


}
