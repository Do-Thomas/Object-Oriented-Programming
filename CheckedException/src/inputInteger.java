
import java.util.Scanner;


public class inputInteger {

//    Scanner sc = new Scanner(System.in);
//    boolean cont = true;
    //int n;
//    do {
//            try {
//            System.out.println("Enter a whole number: ");
////            n = Integer.parseInt(sc.nextLine());
//            n = sc.nextInt();
//            cont = false;
//        } catch (Exception e) {
//            System.out.println("Required integer!");
////            return n;
//        }
//            
//    }while (cont == true || n < 10 || n > 50 );
        

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean cont = true;
    int n = 0;
    do {
            try {
            System.out.println("Enter a whole number: ");
//            n = Integer.parseInt(sc.nextLine());
//            n = sc.nextInt();
            n = Integer.parseInt(sc.nextLine());
            cont = false;
        } catch (Exception e) {
            System.out.println("Required integer!");
//            return n;9
        }
            
    }while (cont == true || n < 10 || n > 50 );
//     n = sc.nextInt(); 
    System.out.println("Number: " + n);

}
}