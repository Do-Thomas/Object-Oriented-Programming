
package training.entities;


public class Teacher extends Person{
    double basicSalary;
    double subsidy;   //tiền trợ cấp

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
    
    
    
    public double calculateSalary(){
        return basicSalary + subsidy;
    }

    @Override
    public String toString() {
        return super.toString() + ", BasicSalary = " + basicSalary + ", Subsidy = " + subsidy + ", Total Salary = " + calculateSalary() +'}';
    }
    
    
}
