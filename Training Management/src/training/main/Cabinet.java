package training.main;

import java.util.Scanner;

public class Cabinet {

    public static int getInt(String msg) {
        boolean cont;
        int value = 0;
        do {
            cont = false;
            System.out.print(msg);
            try {
                value = Integer.parseInt(new Scanner(System.in).nextLine());
            } catch (Exception e) {
                System.out.println("wrong!");
                cont = true;
            }
        } while (cont);
        return value;
    }

    public static float getFloat(String msg) {
        boolean cont;
        float value = 0;
        do {
            cont = false;
            System.out.print(msg);
            try {
                value = Float.parseFloat(new Scanner(System.in).nextLine());
            } catch (Exception e) {
                System.out.println("wrong!");
                cont = true;
            }
        } while (cont);
        return value;
    }

    public static String getString(String msg) {
        String value = "";
        do {
            System.out.print(msg);
            value = new Scanner(System.in).nextLine();
        } while (value.isEmpty());
        return value;
    }

    public static int getInt(String msg, int min) {
        boolean cont;
        int value = 0;
        do {
            System.out.print(msg);
            try {
                cont = false;
                value = Integer.parseInt(new Scanner(System.in).nextLine());
                if (value <= min) {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("please input correct!");
                cont = true;
            }
        } while (cont);
        return value;
    }

    public static int getInt(String msg, int min, int max) {
        boolean cont;
        int value = 0;
        do {
            cont = false;
            System.out.print(msg);
            try {
                value = Integer.parseInt(new Scanner(System.in).nextLine());
                if (value <= min || value >= max) {
                    throw new Exception();
                }
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


