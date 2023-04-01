
package training.main;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Cabinet {

    private static Scanner sc = new Scanner(System.in);

    public static int getAnInteger(String inputMsg, String errorMsg) {
        int n;
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    public static String getString(String inputMsg, String errorMsg) {
        String id;
        while (true) {
            System.out.print(inputMsg);
            id = sc.nextLine().trim();
            if (id.length() == 0 || id.isEmpty()) {
                System.out.println(errorMsg);
            } else {
                return id;
            }
        }
    }
    
     public static String getString(String msg) {
        String value = "";
        do {
            System.out.print(msg);
            value = new Scanner(System.in).nextLine();
        } while (value.isEmpty());
        return value;
    }
    
    public static double getADouble(String msg) {
        boolean cont;
        double value = 0;
        do {
            cont = false;
            System.out.print(msg);
            try {
                value = Double.parseDouble(new Scanner(System.in).nextLine());
            } catch (Exception e) {
                System.out.println("wrong!");
                cont = true;
            }
        } while (cont);
        return value;
    }

    public static boolean getBoolean(String msg) {
        boolean cont = false, value = true;
        do {
            System.out.print(msg);
            try {
                value = new Scanner(System.in).nextBoolean();
            } catch (Exception e) {
                System.out.println("wrong!");
                cont = true;
            }
        } while (cont);
        return value;
    }

}
