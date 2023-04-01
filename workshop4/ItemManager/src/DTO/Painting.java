package DTO;

import java.util.Scanner;

public class Painting extends Item {

    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {

    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public void inputPainting() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a height: ");
        height = Integer.parseInt(sc.nextLine());
        System.out.print("Input a width: ");
        width = Integer.parseInt(sc.nextLine());
        System.out.print("Does it Watercolour: ");
        isWatercolour = sc.nextBoolean();
        System.out.print("Does is Framed: ");
        isFramed = sc.nextBoolean();
    }

    public void outputPainting() {
        super.output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Does is Watercolour: " + isWatercolour);
        System.out.println("Does is Framed: " + isFramed);
    }

}
