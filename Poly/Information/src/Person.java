

import java.util.Scanner;


public class Person {
    private String id;
    private String name;

    public Person() {
    }

    public Person(String id) {
        this.id = id;
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
//    public void input(Info info) {
//        setId(info.getId());
//        setName(info.getName());
//        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter name: ");
//        name = sc.nextLine();
//        
//        System.out.println("Enter ID name: ");
//        id = Integer.parseInt(sc.nextLine());
//
//    }
    
    public void input() {
//        setId(info.getId());
//        setName(info.getName());
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        
        System.out.print("Enter ID name: ");
        id = sc.nextLine();

    }
    
    public void display() {
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
    }

}
