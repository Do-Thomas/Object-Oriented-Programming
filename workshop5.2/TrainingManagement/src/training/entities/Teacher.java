package training.entities;

import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends Person {

    double basicSalary;
    double subsidy;

    public Teacher() {
    }

    public Teacher(String name, String gender, int phone, String email) {
        super(name, gender, phone, email);
    }

    public Teacher(double basicSalary, double subsidy) {
        this.basicSalary = basicSalary;
        this.subsidy = subsidy;
    }

    public Teacher(String name, String gender, int phone, String email, double basicSalary, double subsidy) {
        super(name, gender, phone, email);
        this.basicSalary = basicSalary;
        this.subsidy = subsidy;
    }

    public double calculateSalary() {
        double Salary;
        Salary = basicSalary + subsidy;
        System.out.println("Salary: " + Salary);
        return Salary;
    }

    public class TeacherList extends ArrayList<Teacher> {

        public ArrayList<Teacher> getTeacherList() {
            return this;
        }
        
        public boolean addTeacher(Teacher newTeacher) {
            try {
                return this.add(newTeacher);
            } catch (Exception e) {
                return false;
            }
        }
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input(); 
        System.out.print("Enter basic salary: ");
        double basicSalary = Double.parseDouble(sc.nextLine());
        System.out.print("Enter subsidy: ");
        double subsidy = Double.parseDouble(sc.nextLine());
    }
    
    
}
