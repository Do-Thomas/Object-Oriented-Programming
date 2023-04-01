
package DTO;

public class FPTUniversity extends University implements Role {
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public FPTUniversity(String address) {
        this.address = address;
    }

    public FPTUniversity(String address, String name, int size) {
        super(name, size);
        this.address = address;
    }
    
    @Override
    public void createWorker() {
        System.out.println("Providing human resources");
    }

    @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon";
    }
    
    
    
}
