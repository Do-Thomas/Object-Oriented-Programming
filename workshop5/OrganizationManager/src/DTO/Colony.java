
package DTO;

public class Colony extends Organization {
    String place;

    public Colony() {
    }

    public Colony(String place, int size) {
        super(size);
        this.place = place;
    }
    
    public void grow() {
        System.out.println("An annnual cycle of growth that begins in spring");
    }
    
    public void  reproduce() {
        System.out.println("Colony can reproduce ifself through a process");
    }
    
    @Override
    public String toString() {
        return "The colony size is " + getSize() + ",the colony's place is " + place ;
    }

    @Override
    void communicateByTool() {
        System.out.println("The colony communicate by sound");
    }
    
    
}
