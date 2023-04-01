
package Car;

import java.util.Scanner;

public interface Tax {
    void calculateTax();
}

public interface Price {
    void calculatePrice();
}
    
    
    
    
    
    
public class Actionable implements  {
       int tax;
    int price; // Giá gốc
    int total;
    int seat; // số lượng chỗ trên xe
    
    public void inputCar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter information your car ");
        System.out.println("Enter amount of seat: ");
        seat = Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter price Car: ");
        price = Integer.parseInt(sc.nextLine());
        
    }
    
    //Tính thuế của 1 loại phương tiện
//    public void calculateTax() {
//        if (seat < 7) {
//            tax = (int) (price*0.6);
//        } else {
//            tax = (int) (price*0.7);
//        }
//        
//    }
//    
//    //Tính tổng tiền của 1 loại phương tiện
//    public void calculatePrice(){
//        total = tax + price;
//    }
//    
//    //Trả về thông tin của phương tiện
//    public void getInfo() {
//        System.out.println(" car produced by … in " + " has " + seat + "seats with the total price is " + price + "$”. ");
//    }
    
}
 
