package GUI;


import DTO.CarList;
import DTO.BrandList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class CarManage {

    public static void main(String[] args) throws IOException, Exception {
        ArrayList<String> options = new ArrayList<>();
        options.add("1 - List all bands");
        options.add("2 - Add a new brand");
        options.add("3 - Search a brand based on its ID");
        options.add("4 - Update a brand");
        options.add("5 - Save brands to the file, named brands.txt");
        options.add("6 - List all cars in ascending order of brand names");
        options.add("7 - List cars based on a part of an input brand name");
        options.add("8 - Add a Car");
        options.add("9 - Remove a car based on its ID");
        options.add("10 - Update a car based on its ID");
        options.add("11 - Save cars to file, named cars.txt");
        Scanner sc = new Scanner(System.in);

        int choice = 0;
        BrandList listB = new BrandList();
        listB.loadFromFile("brands.txt");
        CarList listC = new CarList(listB);
        listC.loadFromFile("cars.txt");
        do {
            System.out.println("\nCar managing program");
            choice = Menu.int_getChoice(options);
            switch (choice) {
                case 1:
                    listB.listBrands();
                    break;

                case 2:
                    listB.addBrand();
                    break;

                case 3:
                    System.out.println("Enter ID to be searched: ");
                    System.out.println(listB.search(sc.nextLine()));
                    break;

                case 4:
                    listB.updateBrand();
                    break;

                case 5:
                    listB.saveToFile("brands.txt");
                    break;

                case 6:
                    listC.listCars();
                    break;

                case 7:
                    listC.printBasedBrandName();
                    break;

                case 8:
                    listC.addCar();
                    break;

                case 9:
                    listC.removeCar();
                    break;

                case 10:
                    listC.updateCar();
                    break;

                case 11:
                    listC.saveToFile("cars.txt");
                    break;
                default:
                    System.out.println("Bye!");
            }
        } while (choice > 0 && choice <= 11);
    }
}
