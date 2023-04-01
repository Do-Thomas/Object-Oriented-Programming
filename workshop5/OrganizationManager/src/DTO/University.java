
package DTO;

public class University extends Organization {
    private String name;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public University() {
    }
    
    public University(String name) {
        this.name = name;
    }

    public University(String name, int size) {
        super(size);
        this.name = name;
    }
    
    @Override
    void communicateByTool() {
        System.out.println("In the university, people communicate by voice");
    }

    @Override
    public String toString() {
        return "Encourage the advancement and development of knowledge";
    }
    
    public void enroll() {
        System.out.println("The registration for enrollment is only valid when the University has received all enrollment documents and enrollment fees");
    }
    
    public void educate() {
        System.out.println("Provide education at university standard");
    }

}
