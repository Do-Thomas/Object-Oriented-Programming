
import java.util.Scanner;


public class Emloyee extends Person {
    private String degree;

    public Emloyee() {
    }
  
    public Emloyee(String degree, String name, String address, String mail, int phone) {
        super(name, address, mail, phone);
        this.degree = degree;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your degree: ");
        degree = sc.nextLine();
    }

    @Override
    public void show() {
        super.show(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Degree: " + degree);
    }
    
    
    
}

