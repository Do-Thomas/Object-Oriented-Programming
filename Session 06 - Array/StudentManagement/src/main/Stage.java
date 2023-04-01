
package main;
import data.Cabinet;
import data.Student;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class Stage {

    public static void main(String[] args) {
        Cabinet tuSE = new Cabinet("Green", "SE");
        tuSE.inputStudentList();
        tuSE.printStudentList();
        
       //inputStudentList();
    }
    
    public static void inputStudentList() {
        Scanner sc = new Scanner(System.in);
        String id, name;
        int yob, count;
        double gpa;
        
        System.out.print("How many student do you want to input:");
        count = Integer.parseInt(sc.nextLine()); //MyToys.getAnInteger(???);
        Student[] arr = new Student[count];
        
        for (int i = 0; i < count; i++) {
            System.out.println("Input student #" + (i + 1) + "/" + count);
            System.out.print("Input id: ");
            id = sc.nextLine();
            System.out.print("Input name: ");
            name = sc.nextLine();
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
            System.out.print("Input GPA: ");
            gpa = Double.parseDouble(sc.nextLine());
            
            arr[i] = new Student(id, name, yob, gpa);
        }
        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i].getGpa() > arr[j].getGpa()) {
                    Student t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = arr[i];
                }
            }
        }
        System.out.println("After sorting, the student list");
        for (Student x : arr) {
            x.showProfile();
        }
        
    }
    
}
