
import java.util.ArrayList;
import java.util.Scanner;
//import java.util.Student;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "";
        ArrayList<Student> students = new ArrayList();
        do {
            System.out.println("1. Add");
            System.out.println("2. Display");
            System.out.println("3. Exit!");

            choice = sc.nextLine();
            switch (choice) {
                case "1": // add
                    Student s = new Student();
                    System.out.println("ID: ");
                    s.setId(sc.nextLine());
                    
                    System.out.println("Name: ");
                    s.setId(sc.nextLine());
                    
                    System.out.println("Age: ");
                    s.setOld(Byte.parseByte(sc.nextLine()));
                    students.add(s);
                    break;
                case "2": //display
                    for (Student st : students) {
                        System.out.println("Id: " + st.getId() + "Name: " 
                                + st.getName() + " Age: " + st.getOld());
                    }
                    break;
            }
        } while (!"3".equals(choice));//NullPointer

    }

   
}
