package person;

import java.util.Scanner;

public class Student extends Person {

    private int GDP;

    public int getGDP() {
        return GDP;
    }

    public void setGDP(int GDP) {
        this.GDP = GDP;
    }
    
    public static void main(String[] args) {
        boolean cont = false;
        do {            
            try {
                String s = "";
                String pattern = "^SE\\d{3}$";
                Scanner sc = new Scanner(System.in);
                s = sc.nextLine();
                if ( ! s.matches(pattern))
                    throw new Exception();
                System.out.println("The string is " + s);
                cont = false;
            } catch (Exception e) {
                System.out.println("The string is invalid ");
                cont = true;
            }
        } while (cont);
    }

}
