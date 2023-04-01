/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antiqueshop;

import java.util.Scanner;



/**
 *
 * @author Dell
 */
public class Item {
    protected int value;
    protected String creator;
    
    public Item(){
        value = 0;
        creator = "";
    }
//    public void input(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("input value:");
//         value = sc.nextInt();
//        setValue(value);
//        System.out.println("input creator: ");
//         creator = sc.nextLine();
//        setCreator(creator);
//    }
    public void input() {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Input the value: ");
        value = sc.nextInt();
        sc.nextLine();
        System.out.print("Input the creator: ");
        creator =sc.nextLine(); 
    }
    public void output() {
        System.out.println("output of value: " + value);
        System.out.println("output of creator: " + creator);
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
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
   
}
