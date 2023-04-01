
import java.util.Scanner;

public class Part3 {

    public static void main(String[] args) {
        int i;
        String[] list = new String[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("List names");
        for (i = 0; i < 10; i++) {
            System.out.print("Enter student name " + (i + 1) + ": ");
            list[i] = sc.nextLine();
        }
        
        System.out.println(" \nAfter Upper: ");
        for ( i = 0; i < 10; i++) {
            char[] charArray = list[i].toCharArray();
            boolean space = true;
            for (int j = 0; j < charArray.length; j++) {
                if (Character.isLetter(charArray[j])) {
                    if (space) {
                        charArray[j] = Character.toUpperCase(charArray[j]);
                        space = false;
                    }
                } else {
                    space = true;
                }
            }
            list[i] = String.valueOf(charArray);
            System.out.println(list[i]);

        }
    }
}
