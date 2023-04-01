
package DTO;

import java.util.Scanner;

public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue(int value, String creator) {
        super(value, creator);
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public Statue() {
        
    }

    public void inputStatue() {
        super.input(); 
        Scanner sc = new Scanner(System.in);
        System.out.print("input a weight: ");
        weight = Integer.parseInt(sc.nextLine());
        System.out.print("Input a colour: ");
        colour = sc.nextLine();
    }

    public void outputStatue() {
        super.output(); 
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }  
}
