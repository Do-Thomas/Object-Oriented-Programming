package GUI;

import DTO.Item;
import DTO.Vase;
import DTO.Statue;
import DTO.Painting;
import java.util.Scanner;

public class AntiqueShop {

    public static void main(String[] args) {
        Item item = null;
        String[] options = {"Create a Vase", "Create a Statue", "Create a Statue", "Display the item"};
        int choice = 0;
        Scanner sc = new Scanner(System.in);

        do {
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1:
                    item = new Vase();
                    ((Vase) item).inputVase();
                    break;
                case 2:
                    item = new Statue();
                    ((Statue) item).inputStatue();
                    break;
                case 3:
                    item = new Painting();
                    ((Painting) item).inputPainting();
                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase) {
                            ((Vase) item).outputVase();
                        } else if (item instanceof Statue) {
                            ((Statue) item).outputStatue();
                        } else if (item instanceof Painting) {
                            ((Painting) item).outputPainting();
                        }
                    } else {
                        System.out.println("You need to create an object");
                    }
                    break;
            }
        } while (choice > 0 && choice < 5);
    }
}
