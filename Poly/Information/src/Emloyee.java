
import java.util.Scanner;


public class Emloyee extends Person {
    private String qualitification;

    public Emloyee() {
    }

    public Emloyee(String id) {
        super(id);
    }

    public Emloyee(String id, String name) {
        super(id, name);
    }

    public String getQualitificatioon() {
        return qualitification;
    }

    public void setQualitificatioon(String qualitificatioon) {
        this.qualitification = qualitificatioon;
    }

    @Override
    public void display() {
        super.display(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Qualitification: " + qualitification);
    }

//    @Override
//    public void input(Info info) {
//        super.input(info); //To change body of generated methods, choose Tools | Templates.
//        System.out.println(info.getQualification());
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter qualification: ");
//        qualitification = sc.nextLine();
//    }
    
    
    @Override
    public void input() {
        super.input(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter qualification: ");
        qualitification = sc.nextLine();
    }
}
