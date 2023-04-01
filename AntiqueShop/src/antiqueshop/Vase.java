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
public class Vase extends Item{
    private int height;
    private String material;

    public Vase() {
    }
    
     public void inputVase() {
        input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a height: ");
        height = Integer.parseInt(sc.nextLine());
        System.out.print("Input a material: ");
        material = sc.nextLine();
        
    }
    public void outputVase() {
        output();
        System.out.println("output of height: " +height);
        System.out.println("output of material " +material);
    }

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String getCreator() {
        return creator;
    }

    @Override
    public void setCreator(String creator) {
        this.creator = creator;
    }
  
}
