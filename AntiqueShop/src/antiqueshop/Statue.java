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
public class Statue extends Item{
    private int weight;
    private String color;

    public Statue() {
    }

    public Statue(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }
    public void inputStatue() {
        input();
        Scanner sc = new Scanner (System.in);
        System.out.print("Input the weight: ");
        weight = Integer.parseInt(sc.nextLine());
        System.out.print("Input the colour: ");
        color = sc.nextLine();
    }
    public void outputStatue(){
        output();
        System.out.println("Weight: "+weight);
        System.out.println("Colour: "+ color);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
