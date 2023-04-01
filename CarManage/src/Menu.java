

import java.util.ArrayList;
import java.util.Scanner;


public class Menu {
    public static int int_getChoice(ArrayList options) {
        int response;
        int n = options.size();
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
        System.out.print("Please choose an option 1..." + n + ":");
        Scanner sc = new Scanner(System.in);
        response = Integer.parseInt(sc.nextLine());
        return response;
    }
    
    public static Brand ref_getChoice(ArrayList<Brand> options) {
        int response;
        int n = options.size();
        do {            
            response = int_getChoice(options);
        } while (response < 0 || response > n);
        return options.get(response - 1);
    }
    
    
}   