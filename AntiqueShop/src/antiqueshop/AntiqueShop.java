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
public class AntiqueShop {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        ItemList itemList = new ItemList();
        Item item = null;
        
//        Vase vase = new Vase();
//        Statue statue = new Statue();
//        Painting painting  = new Painting();

        do {
            System.out.println("1.add a new vase");
            System.out.println("2.add a new satue");
            System.out.println("3.add a new painting");
            System.out.println("4.dispay all items");
            System.out.println("5.find the items by creator");
            System.out.println("6.update the item by its index");
            System.out.println("7.remove the item by its index");
            System.out.println("8.display the list of vase items");
            System.out.println("9.sorts iteams in ascending order based on their values");
            System.out.println("10.exit");
            System.out.print("input your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    item = new Vase();
                    ((Vase)item).inputVase();
                    if (itemList.addItem(item)) {
                        System.out.println("added");
                    }
                    break;
                case 2:
                    item = new Statue();
                    ((Statue)item).inputStatue();
                    if (itemList.addItem(item)) {
                        System.out.println("added");
                    }
                    break;
                case 3:
                    item = new Painting();
                    ((Painting)item).inputPainting();
                    if (itemList.addItem(item)) {
                        System.out.println("added");
                    }
                    break;
                case 4:
                    itemList.displayAll();
                    break;
                case 5:
                    System.out.print("input creator: ");
                    String creator = sc.next();
                    itemList.findItem(creator);
                    break;
                case 6:
                    System.out.print("input index: ");
                    int index = sc.nextInt();
                    if ( itemList.updateItem(index)) {
                        System.out.println("updated");
                    }                   
                    break;
                case 7:
                    System.out.print("input index: ");
                    int indexx = sc.nextInt();
                    if (itemList.removeItem(indexx)) {
                        System.out.println("deleted");
                    }                 
                    break;
                case 8:
                    System.out.print("input type(Vase, Statue, Painting): ");
                    String type = sc.next();
                    itemList.displayItemByType(type);
                    break;
                case 9: 
                    itemList.sortItems();
                    break;

            }
        } while (choice <= 9);

    }

}
