/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

/**
 *
 * @author Asus
 */
public class SpecBrick extends Brick{
    int color;

    public SpecBrick() {
    }

    public SpecBrick(int color) {
        this.color = color;
    }

    public SpecBrick(String place, int price, int color) {
        super(place, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + color; 
    }
    
    public void setData() {
        
    }
}
