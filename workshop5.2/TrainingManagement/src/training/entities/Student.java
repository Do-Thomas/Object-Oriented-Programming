package training.entities;

import java.util.Scanner;
import trainning.utils.Validator;

public class Student extends Person {

    private String Id;
    private double theory;
    private double pactice;

    public Student() {
    }

    public Student(String name, String gender, int phone, String email) {
        super(name, gender, phone, email);
    }

    public Student(String Id,  String name, String gender, int phone, String email, double theory, double pactice) {
        super(name, gender, phone, email);
        this.Id = Id;
        this.theory = theory;
        this.pactice = pactice;
    }

    

    public double getPactice() {
        return pactice;
    }

    public void setPactice(double pactice) {
        this.pactice = pactice;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public double getTheory() {
        return theory;
    }

    public void setTheory(double theory) {
        this.theory = theory;
    }

    public double calculateFinalMark() {
        double avg;
        avg = theory + pactice;
        return avg;
    }

    public void inputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an id: ");
        String Id = sc.nextLine();
        super.input();
        
        
        do {
            System.out.print("Enter theory: ");
            theory = Double.parseDouble(sc.nextLine());
            System.out.print("Enter pactice: ");
            pactice = Double.parseDouble(sc.nextLine());
            if (Validator.checkSScore(theory, pactice)) {
                setPactice(pactice);
                setTheory(theory);
            } else {
                System.out.println("Please enter again!");
            }
        } while (Validator.checkSScore(theory, pactice) == true);

    }

}
