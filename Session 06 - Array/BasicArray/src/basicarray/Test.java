/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicarray;

/**
 *
 * @author Asus
 */
public class Test {
    private static int x = 100;
    public static void main(String[] args) {
        Test t = new Test();
        t.x++;
        System.out.println("t = " + t);
        Test h = new Test();
        h.x++;
        System.out.println("x = " + x); //102
        
        System.out.println("h = " + h);
        Test.x++;
        System.out.println("x = " + x);
        
    }
}
