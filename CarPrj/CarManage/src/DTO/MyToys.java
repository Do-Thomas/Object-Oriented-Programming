package DTO;


import java.util.Scanner;

public class MyToys {

    public static boolean checkSId(String Id) {
        return Id.matches("^F\\{3}$");
    }
    
    public static boolean checkSName(String Name) {
        if (Name.length() < 0 || Name.length() > 26) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkSPrice(double price) {
        if (price < 0) {
            return false;
        } else {
            return true;
        }
    }

    public static String checkformat(String inputMsg, String errorMsg, String format) {
        String thingID;
        boolean match;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(inputMsg);
            thingID = sc.nextLine().trim().toUpperCase();
            match = thingID.matches(format);
            if (thingID.length() == 0 || thingID.isEmpty() || match == false) {
                System.out.println(errorMsg);
            } else {
                return thingID;
            }
        }
    }

}
