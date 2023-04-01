/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antiqueshop;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class ItemList {

    Item[] list;
    int numOfItem;
    final int MAX = 100;

    public ItemList() {
        list = new Item[MAX];
        numOfItem = 0;
    }

    public boolean addItem(Item item) {
        if (item == null || numOfItem >= MAX) {
            return false;
        }
        list[numOfItem] = item;
        numOfItem++;
        return true;
    }

    public void displayAll() {
        if (numOfItem == 0) {
            System.out.println("the list is empty");
        }
        for (Item item : list) {
            if (item != null) {
                if (item instanceof Vase) {
                    ((Vase) item).outputVase();
                } else if (item instanceof Statue) {
                    ((Statue) item).outputStatue();
                } else if (item instanceof Painting) {
                    ((Painting) item).outputPainting();
                }
            }
        }
        System.out.println("");

    }

    public Item findItem(String creator) {
        for (int i = 0; i < numOfItem; i++) {
            if (list[i].getCreator().equals(creator)) {
                System.out.println("founded");
                return list[i];
            }
        }
        System.out.println("not founded");
        return null;
    }

    public int findItemIndex(String creator) {
        for (int i = 0; i < numOfItem; i++) {
            if (list[i].getCreator().equals(creator)) {
                return i;
            }
        }
        return -1;
    }

    private static Scanner sc = new Scanner(System.in);

    public boolean updateItem(int index) {
        for (int i = 0; i < numOfItem; i++) {
            if (index >= 0 && index < numOfItem) {
                list[i].input();
                return true;
            }
        }
        return false;
    }

    public boolean removeItem(int index) {
        if (index >= 0 && index < numOfItem) {
            for (int j = index; j < numOfItem; j++) {
                list[j] = list[j + 1];
            }
            numOfItem--;
            return true;
        }
        return false;
    }

    public void displayItemByType(String type) {

        if (type.equals("Vase")) {
            for (Item item : list) {
                if (item instanceof Vase) {
                    ((Vase) item).outputVase();
                }
            }
        } else if (type.equals("Statue")) {
            for (Item item : list) {
                if (item instanceof Statue) {
                    ((Statue) item).outputStatue();
                }
            }
        } else if (type.equals("Painting")) {
            for (Item item : list) {
                if (item instanceof Painting) {
                    ((Painting) item).outputPainting();
                }
            }
        }
    }

    public void sortItems() {
        for (int i = 0; i < numOfItem; i++) {
            for (int j = numOfItem - 1; j > i; j--) {
                if (list[i].getValue() < list[j - 1].getValue()) {
                    Item tmp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = tmp;
                }
            }
        }
        
    }

}
