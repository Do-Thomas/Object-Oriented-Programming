package training.main;

import training.entities.*;
import training.utils.Validator;

public class Program {

    public static void main(String[] args) {
        ManagerProgram personManage = new ManagerProgram();
        int choice;
                
        
        String[] option = {"Input data", "Update student", "Display teacher", "Report", "Quit"};

        do {
            choice = Menu.getChoice(option);
            switch (choice) {
                case 1: {
                    int select = Cabinet.getInt("Choose for 1.Student, 2. Teacher: ");
                    if (select == 1) {
                        personManage.input(new Student());
                    } else if (select == 2) {
                        personManage.input(new Teacher());
                    } else {
                        System.out.println("Please input valid select!");
                    }
                    break;
                }

                case 2: {
                    personManage.updateStudent(Cabinet.getString("Input Student's id you want to update: "));
                    break;
                }

                case 3: {
                    personManage.displayTeacher();
                    break;
                }

                case 4: {
                    personManage.report();
                    break;
                }

                case 5: {
                    System.out.println("Good bye!");
                    break;
                }

                default: {
                    System.out.println("Please choose 1 in 5 option!");
                    break;
                }

            }
        } while (choice != 5);

    }
}
