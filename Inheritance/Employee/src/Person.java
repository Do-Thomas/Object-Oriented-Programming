
import java.util.Scanner;


public class Person {
    String name;
    String address;
    String mail;
    int phone;

    public Person() {
    }
    
    
    public Person(String name, String address, String mail, int phone) {
        this.name = name;
        this.address = address;
        this.mail = mail;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
    //    if (MyValidation.isEmail(mail)) {
            this.mail = mail;
    //    }
//        else 
//            throw new Exception ("Invalid Email!");
        
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        
        System.out.println("Enter address: ");
        address = sc.nextLine();
        
        System.out.println("Enter mail: ");
        mail = sc.nextLine();
        
        System.out.println("Enter number phone: ");
        phone = Integer.parseInt(sc.nextLine());
        
    }
    
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Mail: " + mail);
        System.out.println("Phone: " + phone );
    }

    @Override
    public String toString() {
        return name + ", " + address + ", " + mail + ", " + phone ;
    }
    
    
   
}
