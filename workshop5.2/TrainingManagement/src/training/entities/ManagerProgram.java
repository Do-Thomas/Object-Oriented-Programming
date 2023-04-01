/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.entities;

import java.util.Scanner;
import trainning.utils.Validator;

/**
 *
 * @author Asus
 */
public class ManagerProgram {

    TeacherList tealist;
    StudentList stulist;
    Scanner sc = new Scanner(System.in);
    
//    public class ManagerProgram() {
//        Person persons = new Person[10];
//        int count = 0;
//    }

    public void addStudent() {
        
        int pos;
        boolean cont = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an id: ");
        String Id = sc.nextLine();
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter phone: ");
        int phone = Integer.parseInt(sc.nextLine());
        String email;
        do {
            System.out.print("Enter email: ");
            email = sc.nextLine();
            if (Validator.isEmail(email) == false) {
                System.out.println("Wrong format!");
                System.out.print("Enter email again: ");
                email = sc.nextLine();
            }
            break;
        } while (Validator.isEmail(email));

        String sDob = null;
        DOB dob = null;
        do {
            System.out.println("Date of Birth (dd/mm/yyyy): ");
            try {
                sc = new Scanner(System.in);
                sDob = sc.nextLine().trim();
                dob = new DOB(sDob);
                cont = false;
            } catch (Exception e) {
                System.out.println("Please enter a valid date, ex: 10/2/1989");
                cont = true;
            }
        } while (cont);

        double theory, pactice;
//        do {
            System.out.print("Enter theory: ");
            theory = Double.parseDouble(sc.nextLine());
            System.out.print("Enter pactice: ");
            pactice = Double.parseDouble(sc.nextLine());

//        } while (Validator.checkSScore(theory, pactice) == false);
        Student st = new Student(Id, name, gender, phone, email, theory, pactice);
        stulist.add(st);
        System.out.println("A new student was added.");

    }

    public void addTeacher() {
        String name;
        int pos;
        System.out.println("Teacher's name: ");
        name = sc.nextLine();
        System.out.print("Enter gender: ");
        String gender = sc.nextLine();
        System.out.print("Enter phone: ");
        int phone = Integer.parseInt(sc.nextLine());
        String email;
        do {
            System.out.print("Enter new email: ");
            email = sc.nextLine();
        } while (Validator.isEmail(email) == true);
        String birth;
        do {
            System.out.print("Enter date of birth: ");
            birth = sc.nextLine();
        } while (Validator.isValidDate(name, birth) == true);
        System.out.print("Enter basic salary: ");
        double basicSalary = Double.parseDouble(sc.nextLine());
        System.out.print("Enter subsidy: ");
        double subsidy = Double.parseDouble(sc.nextLine());
        Teacher sb = new Teacher(name, gender, phone, email, basicSalary, subsidy);
        tealist.add(sb);
        System.out.println("A new teacher was added.");
    }

}
