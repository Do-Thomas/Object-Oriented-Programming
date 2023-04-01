package DTO;

import java.util.Scanner;

public class Administration extends Staff {

    private double Allowance; // phụ cấp
    Scanner sc = new Scanner(System.in);

    public Administration(double Allowance, String name, String Id, double baSalary, double senAllowance) {
        super(name, Id, baSalary, senAllowance);
        this.Allowance = Allowance;
    }

    public Administration() {
        super();
    }

    public double getAllowance() {
        return Allowance;
    }

    public double setAllowance() {
        if (Allowance > 0) {
            return Allowance;
        } else {
            System.out.println("No Legal.");
        }
        return 0;
    }

    @Override
    public void inputStaff() {
        super.inputStaff();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Allowance: ");
        Allowance = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Allowance: " + Allowance);
        System.out.println("Salary: " + calculateSalary());
    }

    @Override
    public double calculateSalary() {
        double s;
        s = super.calculateSalary();
        double adSalary;
        adSalary = s + Allowance;
        return adSalary;
        
    }

}
