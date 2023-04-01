package training.main;

import java.util.Scanner;
import java.util.Vector;
import training.entities.ManagerProgram;
import training.entities.Person;
import training.entities.Student;
import training.entities.Teacher;
import trainning.utils.Validator;

public class Program {

    public static void main(String[] args) {
        Menu mainMnu = new Menu ();
        mainMnu.add("1. Add new data");
        mainMnu.add("2. Update Student by Id Student");
        mainMnu.add("3. Display teacher");
        mainMnu.add("4. Report");
        Menu addMnu = new Menu();

        addMnu.add("Add Student");
        addMnu.add("Add Teacher");
        ManagerProgram mng = new ManagerProgram();
        int choice1, choice2;
        do {
            choice1 = mainMnu.getChoice();
            switch (choice1){
                
//                case 1 :
//                    mng.addStudent();
//                    break;
                case 1 :
                    System.out.println(addMnu);
                    do{
                        choice2 = addMnu.getChoice();
                        switch (choice1){
                            case 1 :
                                
                                mng.addStudent();
                                break;
                            case 2:
                                mng.addTeacher();
                                break;
                            default : break;
                        }
                    } while (choice2 > 0 && choice2 <= addMnu.size() );
                    break;
//                    case 3 : 
//                    mng.addSub();
//                    break;
//                case 4 :
//                    System.out.println(subMnu);
//                    do{
//                        choice2 = subMnu.getChoice();
//                        switch (choice2){
//                            case 1 :
//                                mng.updateSubject();
//                                break;
//                            case 2:
//                                mng.deleteSubject();
//                                break;
//                            default : break;
//                        }
//                    } while (choice2 > 0 && choice2 <= subMnu.size() );
//                    break;
//                case 5 :
//                    mng.addGrade();
//                    break;
//               
//                case 6 :
//                    mng.reportStudent();
//                    break;
//                     case 7 :
//                    mng.reportSubject();
//                    break;
                default:
                    System.out.println("Bye!");
            }
        }while (choice1 > 0 && choice1 <= mainMnu.size());
    }
}
     
    

