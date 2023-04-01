
package DTO;

import java.util.Scanner;

public class Item {
    int value;
    String creator;
    
    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public Item() {
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public void output() {
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }
    
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        value = Integer.parseInt(sc.nextLine());
        if ( value > 0) {
            System.out.println("Creator is not empty");
            System.out.print("Input creator: ");
            creator = sc.nextLine();
        }
        else 
            System.out.println("No value");
    }

}
