
import java.util.Scanner;

public class Part2 {

    public static void main(String[] args) {
        float num1, num2;
        String op;
        int n = 1;
        while (n != 0) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number 1: ");
        num1 = sc.nextFloat();
        System.out.print("Input the number 2: ");
        num2 = sc.nextFloat();
        System.out.print("Input the operator(+ - * /): ");
        sc = new Scanner(System.in);
        op = sc.nextLine();
        
            switch (op) {
                case "+":
                    System.out.println("The result of " + num1 + op + num2 + "=" + (num1 + num2));
                    break;
                case "-":
                    System.out.println("The result of " + num1 + op + num2 + "=" + (num1 - num2));
                    break;
                case "*":
                    System.out.println("The result of " + num1 + op + num2 + "=" + (num1 * num2));
                    break;
                case "/":
                    System.out.println("The result of " + num1 + op + num2 + "=" + (num1 / num2));
                    break;
                default:
                    System.out.println("Operation isn't exist!!!!");
            }
            System.out.println("============================================");
            System.out.print("Press 1 is continue, 0 to end operation: ");
            n = sc.nextInt();
        } 

    }
}
