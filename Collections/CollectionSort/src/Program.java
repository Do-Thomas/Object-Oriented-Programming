
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "";
        ArrayList<Student> students = new ArrayList<>();

        do {
//            MenuBar menuBar = new MenuBar();
//            Menu menu = new Menu("Menu");
//            Menu submenu = new Menu("Sub Menu");
//            MenuItem menuItem1 = new MenuItem("1. Add");
//            MenuItem menuItem2 = new MenuItem("2. Display");
//            MenuItem menuItem3 = new MenuItem("3. Sort");
//            MenuItem menuItem31 = new MenuItem("3.1 Ascending sort by Name");
//            MenuItem menuItem32 = new MenuItem("3.2 Descending sort by age");
//            MenuItem menuItem4 = new MenuItem("4. Exit");
//            menu.add(menuItem1);
//            menu.add(menuItem2);
//            menu.add(menuItem3);
//            menu.add(menuItem4);
//            submenu.add(menuItem31);
//            submenu.add(menuItem32);
            System.out.println("1. Add\n");
            System.out.println("2. Display\n");
            System.out.println("3. Sort\n");
            System.out.println("\t 3.1 Ascending sort by name");
            System.out.println("\t 3.2 Descending sort by age");
            System.out.println("\n4. Exit");
            System.out.print("Choice options: ");
            choice = sc.nextLine();

            switch (choice) {
                case "1":
                    Student s = new Student();
                    System.out.print("Enter ID: ");
                    String id = sc.nextLine().trim();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine().trim();
                    System.out.print("Enter Age: ");
                    byte age = Byte.parseByte(sc.nextLine());
                    s = new Student(id, name, age);
                    students.add(s);
                    break;
                case "2":
                    for (Student st : students) {
                        System.out.println("ID: " + st.getId() + "\tName: " + st.getName()
                                + "\tAge: " + st.getAge());
                    }
                    break;
                case "3":
                    String sortChoice = "";
//                    Student st = new Student();
                    System.out.println("3.1: Sort acresing by Name   (Choice:1)");
                    System.out.println("3.2: Sort descreacing by Age (Choice:2)");
                    System.out.print("Choice your sort: ");
                    sortChoice = sc.nextLine();
//                    Collections.sort(students, new SortByName());
//                    for (Student stu : students) {
//                        System.out.println("ID: " + stu.getId() + "\tName: " + stu.getName()
//                                    + "\tAge: " + stu.getAge());
//                    }
                    switch (sortChoice) {
                        case "1":
                            //3.1: Tăng dần theo tên
                            Collections.sort(students, new SortByName());
                            for (Student st : students) {
                                System.out.println("ID: " + st.getId() + "\tName: " + st.getName()
                                        + "\tAge: " + st.getAge());
                            }

                        case "2":
                            //3.2: Giảm dần theo tuổi
                            Collections.sort(students, new SortByAge());
                            for (Student st : students) {
                                System.out.println("ID: " + st.getId() + "\tName: " + st.getName()
                                        + "\tAge: " + st.getAge());
                            }
                    }

                default:
                    System.out.println("BYE!!!");
            }
        } while (!"4".equals(choice));
    }
}
