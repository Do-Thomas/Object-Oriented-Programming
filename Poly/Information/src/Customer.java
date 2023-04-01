
import java.util.Scanner;

public class Customer extends Person {

    boolean vip;

    public Customer() {
    }

    public Customer(String id) {
        super(id);
    }

    public Customer(String id, String name) {
        super(id, name);
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.print((isVip() ? "Vip" : "Normal"));
    }

//    @Override
//    public void input(Info info) {
//        super.input(info); //To change body of generated methods, choose Tools | Templates.
//        setVip(info.isVip());
//        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter vip(True or False): ");
//        vip = sc.nextBoolean();   
//    }
    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
//        setVip(info.isVip());

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter vip(True or False): ");
        vip = sc.nextBoolean();

    }
}
