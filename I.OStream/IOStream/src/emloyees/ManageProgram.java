// Program for managing a list of employees
package emloyees;

import java.util.Scanner;
import emloyees.Menu;
import java.io.FileNotFoundException;

public class ManageProgram {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "employee.txt";
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.add("1.Add new employee");
        menu.add("2.Remove an employee");
        menu.add("3.Promoting the employee's salary");
        menu.add("4.Print the list");
        menu.add("5.Save to files");
        menu.add("Quit");
        int userChoice;
        boolean changed = false;
        EmpList list = new EmpList();
        list.AddFromFile(filename);
        do {            
            System.out.println("\nEMPLOYEE MANAGER");
            userChoice = menu.getUseChoice();
            switch (userChoice) {
                case 1:
                    list.addNewEmp();
                    changed = true;
                    break;
                case 2:
                    list.removeEmp();
                    changed = true;
                    break;
                case 3:
                    list.promte();
                    changed = true;
                    break;
                case 4:
                    list.print();
                    break;
                case 5:
                    list.saveToFile(filename);
                    changed = false;
                default : if (changed) {
                    System.out.println("Save changes Y/N?");
                    String response = sc.nextLine().toUpperCase();
                    if (response.startsWith("Y"))
                        list.saveToFile(filename);
                }
            }
        } while (userChoice > 0 && userChoice < 6);
    }
}
