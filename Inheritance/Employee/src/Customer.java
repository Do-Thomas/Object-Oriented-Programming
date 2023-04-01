
import java.util.Scanner;

public class Customer extends Person{
    private String type;

    public Customer() {
    }
    
    public Customer(String name, String address, String mail, int phone) {
        super(name, address, mail, phone);
        this.type = type;
    }

    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your type degree: ");
        type = sc.nextLine();
    }

    @Override
    public void show() {
        super.show(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Type degree: " + type);
    }
    
    
    
    
    
}
