package DTO;

import java.util.Scanner;

public abstract class Staff {

    private String name;
    private String Id;
    private double baSalary;    //lương căn bản
    private double nSalary;        //hệ số lương
    private double takeHomepay; // lương thực lãnh: lương thực tế, lương ròng
    private double seniority; // thâm niên công tác
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public double getBaSalary() {
        return baSalary;
    }

    public void setBaSalary(double baSalary) {
        this.baSalary = baSalary;
    }
    
    //Lương thực lãnh.
    public void gettakeHomepay() {
        nSalary = 1;
        int year = 0;
        if (year > 0) {
            for (int i = 0; ;i += 5) {
                nSalary += 1;
            }
        }
    }
    
    public void setTakeHomepay(double takeHomepay) {
        this.takeHomepay = takeHomepay;
    }
    
    public double getSeniority() {
        return seniority;
    }
    //Thâm niên công tác không chấp nhận số âm
    public double setSenAllowance() {
        if (seniority> 0)
            return this.seniority = seniority;
        else
            System.out.println("Illegal");
        return seniority = -1;
    }
    
    public Staff(String name, String Id, double baSalary, double senAllowance) {
        this.name = name;
        this.Id = Id;
        this.baSalary = baSalary;
        this.seniority = senAllowance;
    }

    public Staff() {
    }
    
    public void inputStaff() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input name: ");
        name = sc.nextLine();
        System.out.println("Input ID: ");
        Id = sc.nextLine();
        System.out.println("Input bascic salary: ");
        baSalary = Double.parseDouble(sc.nextLine());
        System.out.println("Input coefficients salary: ");
        nSalary = Double.parseDouble(sc.nextLine());
        System.out.println("Input take home pay:  ");
        takeHomepay = Double.parseDouble(sc.nextLine());
        System.out.println("Input seniority: ");
        seniority = Double.parseDouble(sc.nextLine());
        
    }

    public double calculateSalary() {
        takeHomepay = baSalary * nSalary;
        return 0;
    }
    
    public void show() {
        
        System.out.println("Name: " + name);
        System.out.println("Id name: " + Id);
    }

}
