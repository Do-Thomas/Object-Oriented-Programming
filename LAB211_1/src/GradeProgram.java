
import data.StudentManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
// 
public class GradeProgram {
    public static void main (String [] args) throws Exception{
        Menu mainMnu = new Menu ();
        mainMnu.add("Add new Student");
        mainMnu.add("Update Student");
        mainMnu.add("Add new Subject");
        mainMnu.add("Update Subject");
        mainMnu.add("Enetr Grade");
        mainMnu.add("Display Student Grade Report");
        mainMnu.add("Display Subject Grade Report");
        Menu stMnu = new Menu();
        stMnu.add("Update Student");
        stMnu.add("Delete Studant");
        Menu subMnu = new Menu();
        subMnu.add("Update Subject");
        subMnu.add("Delete Subject");
        StudentManager mng = new StudentManager ();
        int choice1, choice2;
        do {
            choice1 = mainMnu.getChoice();
            switch (choice1){
                
                case 1 :
                    mng.addStudent();
                    break;
                case 2 :
                    System.out.println(stMnu);
                    do{
                        choice2 = stMnu.getChoice();
                        switch (choice2){
                            case 1 :
                                mng.updateStudent();
                                break;
                            case 2:
                                mng.deleteStudent();
                                break;
                           
                        }
                    } while (choice2 > 0 && choice2 <= stMnu.size() );
                    break;
                    case 3 : 
                    mng.addSubject();
                    break;
                case 4 :
                    System.out.println(subMnu);
                    do{
                        choice2 = subMnu.getChoice();
                        switch (choice2){
                            case 1 :
                                mng.updateSubject();
                                break;
                            case 2:
                                mng.deleteSubject();
                                break;
                            default : break;
                        }
                    } while (choice2 > 0 && choice2 <= subMnu.size() );
                    break;
                case 5 :
                    mng.addGrade();
                    break;
               
                case 6 :
                    mng.reportStudent();
                    break;
                     case 7 :
                    mng.reportSubject();
                    break;
                default:
                    System.out.println("Bye!");
            }
        }while (choice1 > 0 && choice1 <= mainMnu.size());
    }
    
}
