package DTO;

import java.util.Scanner;

public class Marketing extends Staff {

    private double Sales;
    private double Roses;
    double Salary;
    Scanner sc = new Scanner(System.in);

    public Marketing(double Sales, double Roses, String name, String Id, double baSalary, double seniority) {
        super(name, Id, baSalary, seniority);
        this.Sales = Sales;
        this.Roses = Roses;
    }

    public Marketing() {
       super();
    }


    public double getRoses() {
        if (Sales >= 5000000 && Sales <= 10000000) {
            Roses = 0.05 * Sales;
            return Roses;
        } else if (Sales >= 10000000 && Sales <= 20000000) {
            Roses = 0.1 * Sales;
            return Roses;
        } else {
            System.out.println("Not enough.");
            return 0;
        }
    }

    public void setRoses(double Roses) {
        this.Roses = Roses;
    }

    public double setSales() {
        if (Sales > 0) {
            return Sales;
        } else {
            System.out.println("Illegal");
        }
        return 0;
    }
    
    public double getSales() {
        return Sales;
    }

    @Override
    public double calculateSalary() {
        double s = super.calculateSalary();
        Salary = s + Sales * Roses;
        return Salary;
    }

    @Override
    public void inputStaff() {
        super.inputStaff();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input sale: ");
        Sales = Double.parseDouble(sc.nextLine());
        System.out.print("Input roses: ");
        Roses = Double.parseDouble(sc.nextLine());
        
    }
    

    @Override
    public void show() {
        super.show();
        System.out.println("Sales: " + Sales);
        System.out.println("Roses: " + Roses);
        System.out.println("Salary: " + calculateSalary());
    }



}
