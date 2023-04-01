/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Tran Phong <phongntse150974@fpt.edu.vn>
 */
public class MyUtil {

    public static boolean checkString(String s, String pattern) {
        return s.matches(pattern);
    }

    public static boolean checkEqualString(String s, String x) {
        return s.equals(x);
    }

    public static boolean isEmptyString(String s) {
        return s.trim().isEmpty();
    }

    public static String inputString(String pattern) throws Exception {
        String text = "";
        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();
        if (!text.matches(pattern)) {
            throw new Exception("Text is invalid");
        }
        return text;
    }

    public static String inputString() throws Exception {
        String text = "";
        Scanner sc = new Scanner(System.in);
        text = sc.nextLine();
        if (isEmptyString(text)) {
            throw new Exception("Empty String!");
        }
        return text;
    }

    public static boolean isGender(String gender) {
        return gender.toLowerCase().matches("m|f|male|female");
    }

    public static boolean isEmail(String email) {
        String pattern = "^[a-zA-Z]([a-zA-Z0-9_.-])+{4,31}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
        return checkString(email, pattern);
    }

    public static boolean isPhone(String phone) {
        return checkString(phone, "^0(([0-9]){9,11})");
    }

    public static boolean checkIntNumber(int num, int min, int max) {
        return num >= min && num <= max;
    }

    public static boolean checkIntNumMax(int num, int max) {
        return num <= max;
    }

    public static boolean checkIntNumMin(int num, int min) {
        return num >= min;
    }

    public static boolean isValidDate(int year, int month, int day) {
        return isValidDate(day + "/" + month + "/" + year, "dd/MM/yyyy") && (year < 2022 || (year == 2022 && month <= 6 && day <= 9));
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

    public static int inputIntNumber(int min, int max) throws Exception {
        int result = min;
        Scanner sc = new Scanner(System.in);
        result = sc.nextInt();
        if (result < min || result > max) {
            throw new Exception("Domain is invalid");
        }
        return result;
    }

    public static int inputIntNumberMin(int min) throws Exception {
        int result = min;
        Scanner sc = new Scanner(System.in);
        result = sc.nextInt();
        if (result < min) {
            throw new Exception("Domain is invalid");
        }
        return result;
    }

    public static int inputIntNumberMax(int max) throws Exception {
        int result = max;
        Scanner sc = new Scanner(System.in);
        result = sc.nextInt();
        if (result < max) {
            throw new Exception("Domain is invalid");
        }
        return result;
    }

    public static boolean checkFloatNumber(double num, double min, double max) {
        return num >= min && num <= max;
    }

    public static boolean checkFloatNumMax(double num, double max) {
        return num <= max;
    }

    public static boolean checkFloatNumMin(double num, double min) {
        return num >= min;
    }

    public static double inputFloatNumber(double min, double max) throws Exception {
        double result = min;
        Scanner sc = new Scanner(System.in);
        result = sc.nextDouble();
        if (result < min || result > max) {
            throw new Exception("Domain is invalid");
        }
        return result;
    }

    public static double inputFloatNumberMin(double min) throws Exception {
        double result = min;
        Scanner sc = new Scanner(System.in);
        result = sc.nextDouble();
        if (result < min) {
            throw new Exception("Domain is invalid");
        }
        return result;
    }

    public static double inputFloatNumberMax(double max) throws Exception {
        double result = max;
        Scanner sc = new Scanner(System.in);
        result = sc.nextFloat();
        if (result < max) {
            throw new Exception("Domain is invalid");
        }
        return result;
    }

    public static void getEnter() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press Enter to continue...");
        do {
            if (isEmptyString(sc.nextLine())) {
                return;
            }
        } while (true);
    }

    public static void getEnter(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        do {
            if (isEmptyString(sc.nextLine())) {
                return;
            }
        } while (true);
    }

    public static boolean isName(String name) {
        return checkString(name, "([a-zA-z ]){1,40}");
    }

    public static String convertGender(String gender) {
        if (isGender(gender)) {
            if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("m")) {
                return "m";
            } else if (gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("f")) {
                return "f";
            }
        }
        return "";
    }

    public static int isContinue() {
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        int result = -1;
        do {
            System.out.print("Do you want to continue (y/n)? ");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                result = 1;
                cont = false;
            } else if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {
                result = 0;
                cont = false;
            } else {
                cont = true;
            }
        } while (cont);
        return result;
    }

    public static int isContinue(String message) {
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        int result = -1;
        do {
            System.out.print(message);
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes")) {
                result = 1;
                cont = false;
            } else if (answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no")) {
                result = 0;
                cont = false;
            } else {
                cont = true;
            }
        } while (cont);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convertGender("f"));
    }
}
