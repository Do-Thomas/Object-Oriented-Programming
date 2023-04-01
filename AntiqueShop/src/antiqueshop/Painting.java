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
public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolor;
    private boolean isFramed;

    public Painting() {
    }

    
    
    public Painting(int height, int width, boolean isWatercolor, boolean isFramed) {
        this.height = height;
        this.width = width;
        this.isWatercolor = isWatercolor;
        this.isFramed = isFramed;
    }

    public Painting(int height, int width, boolean isWatercolor, boolean isFramed, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolor = isWatercolor;
        this.isFramed = isFramed;
    }

     public void inputPainting(){
        input();
        Scanner sc= new Scanner(System.in);
        System.out.print("Inut the height: ");
        height= sc.nextInt();
        System.out.print("Inut the width: ");
        width= sc.nextInt();
        System.out.print("Is it watercolor: true or false ");
        isWatercolor = sc.nextBoolean();
        System.out.print("Is it framed: true or false ");
        isFramed= sc.nextBoolean();
        
    }
    
    public void outputPainting(){
        output();
        System.out.println("Height: "+height);
        System.out.println("Ưidth: "+ width);
        System.out.println("Watercolor: "+isWatercolor);
        System.out.println("Framed: "+ isFramed);
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

    public boolean isIsWatercolor() {
        return isWatercolor;
    }

    public void setIsWatercolor(boolean isWatercolor) {
        this.isWatercolor = isWatercolor;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
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
