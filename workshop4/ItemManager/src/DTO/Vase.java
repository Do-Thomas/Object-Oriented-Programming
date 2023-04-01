package DTO;

import java.util.Scanner;

public class Vase extends Item {

    private int height;
    private String material;

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public Vase() {
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

    public void inputVase() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a height: ");
        height = Integer.parseInt(sc.nextLine());
        System.out.print("Input a  material: ");
        material = sc.nextLine();
    }

    public void outputVase() {
        super.output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }

}
