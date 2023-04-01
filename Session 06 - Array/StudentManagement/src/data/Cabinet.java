//OOP: tìm các Object, chúng phối hợp, trộn với nhau
package data;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Cabinet {

    private String color;
    private String label;

    private Student[] ds = new Student[300];
    private Scanner sc = new Scanner(System.in);
    private int count = 0; // nhét thêm 1 hồ sơ count++
    
    public Cabinet(String color, String label) {
        this.color = color;
        this.label = label;
    }
    
    public void inputStudentList() {
        Scanner sc = new Scanner(System.in);
        String id, name;
        int yob;
        double gpa;
        
        System.out.println("Input student #" + (count + 1) + "/" + ds.length);
        System.out.print("Input id: ");                         //#1/300
        id = sc.nextLine();
        System.out.print("Input name: ");
        name = sc.nextLine();
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        System.out.print("Input GPA: ");
        gpa = Double.parseDouble(sc.nextLine());
        ds[count] = new Student(id, name, yob, gpa);
        count++;

    }
    
    public void printStudentList() {
        System.out.println("The student list");
        for (int i = 0; i < count; i++) {
            ds[i].showProfile();  //For hết là toang.
        }
        
    }
}
