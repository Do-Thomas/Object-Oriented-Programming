/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.main;

import java.util.Scanner;
import training.entities.Student;
import training.entities.Teacher;

/**
 *
 * @author Asus
 */
public class Program {

    public static void main(String[] args) {
        ManagerProgram personList = new ManagerProgram();
        String[] options = {"1. Input person", "2. Update student by student Id", "3. Display teacher", "4. Report"};
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1:
                    System.out.println("Choose 1(Student). 2(Teacher): ");
                    int choose;
                    choose = sc.nextInt();
                    if (choose == 1) {
                        personList.input(new Student());
                    } else if (choose == 2) {
                        personList.input(new Teacher());
                    } else {
                        System.out.println("Please enter valid option!");
                    }
                    break;

                case 2:
                    personList.updateStudent(Cabinet.getString("Enter Student's Id you want to update: ", "Enter Student's Id you want to update: "));
                    break;

                case 3:
                    personList.displayTeacher();
                    break;

                case 4:
                    personList.report();
                    break;
                    
                default:
                    System.out.println("Bye!");
            }
        } while (choice > 0 && choice < 5);
    }

}
