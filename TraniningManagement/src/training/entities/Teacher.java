/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package training.entities;

/**
 *
 * @author Asus
 */
public class Teacher extends Person {

    double basicSalary;
    double subsidy;

    @Override
    void purchaseParkingPass() {

    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(double subsidy) {
        this.subsidy = subsidy;
    }

    public double calculateSalary() {
        return basicSalary + subsidy;
    }

    @Override
    public String toString() {
        return super.toString() + ", BasicSalary = " + basicSalary + ", Subsidy = " + subsidy + ", Total Salary = " + calculateSalary() + '}';
    }

}
