
package emloyees;

import java.util.Scanner;
import java.util.Vector;


public class Menu extends Vector <String> {

    public Menu() {
        super();
    }
    
    void addMenuItem(String S) {
        this.add(S);
    }
    
//    int getUserChoice (Object[] options) {
//        for (int i = 0; i < options.length; i++) {
//            System.out.println((i+1) + "-" + options[i]);
//        }
//        System.out.print("Choose 1.." + options.length + ": ");
//        Scanner sc = new Scanner(System.in);
//        return Integer.parseInt(sc.nextLine());
//    }

//    public int getUseChoice(Object[] options) {
//        for (int i = 0; i < options.length; i++) {
//            System.out.println((i+1) + "-" + options[i]);
//        }
//        System.out.print("Choose 1.." + options.length + ": ");
//        Scanner sc = new Scanner(System.in);
//        return Integer.parseInt(sc.nextLine());
//    }
    
    public int getUseChoice() {
        int i = 1;
        for (String option : this) {
            System.out.println((i++) + "-" + option);
        }
        System.out.print("Choose: ");
        Scanner sc = new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
    
}
