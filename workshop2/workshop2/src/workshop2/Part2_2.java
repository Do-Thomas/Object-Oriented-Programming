
package workshop2;

import java.util.Scanner;

public class Part2_2 {
    public String inputString() throws Exception {
        String pattern = "^SE\\d{3}$";
        String s ="";
        Scanner sc = new Scanner(System.in);
        
        s = sc.nextLine();
        if ( !s.matches(pattern))
            throw new Exception();
        return s;
    }
    public static void main(String[] args) {
        Part2_2 obj = new Part2_2();
        boolean cont = false;
        do {            
            try {
                System.out.println("Input the string: ");
                String s = obj.inputString();
                System.out.println("The string is " + s);
                cont = false;
            } catch (Exception e) {
                System.out.println("The string is invalid ");
                cont = true;
            }
        } while (cont);
    }
    
}
