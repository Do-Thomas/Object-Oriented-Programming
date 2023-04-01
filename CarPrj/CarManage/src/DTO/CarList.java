package DTO;


import GUI.Menu;
import DTO.MyToys;
import DTO.Car;
import DTO.BrandList;
import DTO.Brand;
import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CarList extends ArrayList<Car> {

    private ArrayList<Car> listCar = new ArrayList<Car>();
    BrandList brandList = new BrandList();
    Scanner sc = new Scanner(System.in);

    public CarList(BrandList bList) {
        brandList = bList;
    }

    public Car searchCarID(String ID) {
        for (int i = 0; i < listCar.size(); i++) {
            if (listCar.get(i).getCarID().contains(ID)) {
                return listCar.get(i);
            }
        }
        return null;
    }

    public boolean loadFromFile(String filename) throws FileNotFoundException, IOException {
        File f = new File(filename);
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        Brand b = null;
        if (!f.exists()) {
            System.out.println("File not exist!");
        }
        String s;
        while ((s = br.readLine()) != null) {
            try {
                StringTokenizer st = new StringTokenizer(s, ",");

                while (st.hasMoreTokens()) {
                    String CarID = st.nextToken().trim();
                    String BrandID = st.nextToken().trim();
                    String color = st.nextToken().trim();
                    String FrameID = st.nextToken().trim();
                    String EngineID = st.nextToken().trim();
                    int pos = brandList.searchID(BrandID);
                    b = brandList.listB().get(pos);
                    listCar.add(new Car(CarID, b, color, FrameID, EngineID));
                }

            } catch (Exception e) {
                br.close();
                fr.close();
            }
        }
        return true;
    }

    public boolean saveToFile(String filename) throws IOException {
        FileWriter fr = new FileWriter(filename);
        BufferedWriter br = new BufferedWriter(fr);
        for (int i = 0; i < listCar.size(); i++) {
            if (listCar.get(i) != null) {
                String s = "";
                s += listCar.get(i) + "\n";
                br.write(s);
            }
        }
        System.out.println("Save to file successfully!");
        br.close();
        fr.close();
        return true;
    }

    public int searchID(String carID) {
        int n = listCar.size();
        for (int i = 0; i < n; i++) {
            if (listCar.get(i).getCarID().equals(carID)) {
                return i;
            }
        }
        return -1;
    }

    public Car searchFrame(String fID) {
        int n = listCar.size();
        for (int i = 0; i < n; i++) {
            if (this.get(i).getFrameID().contains(fID)) {
                return listCar.get(i);

            }
        }
        return null;
    }

    public Car searchEngine(String eID) {
        int n = listCar.size();
        for (int i = 0; i < n; i++) {
            if (this.get(i).getEngineID().contains(eID)) {
                return listCar.get(i);

            }
        }
        return null;
    }

    public void addCar() {
        String newCarID = "";
        String newColor = "";
        String newFrameID = "";
        String newEngineID = "";

        newCarID = MyToys.checkformat("Enter Car ID: ", "Wrong format!", "^[C|d]\\d{2}$");
        int PosCarID = searchID(newCarID);
        if (PosCarID < 0 || newCarID == "C05" || newCarID == "C08") {
            System.out.println("Car ID not exist!");

            Brand b;
            System.out.println("Brand List:");
            b = (Brand) Menu.ref_getChoice(brandList.listB());
            do {
                System.out.print("Enter Color: ");
                newColor = sc.nextLine().trim();
            } while (MyToys.checkSName(newColor) == false && newColor.isEmpty());

            newFrameID = MyToys.checkformat("Enter Frame ID(F00000): ", "Wrong format!", "^[F|d]\\d{5}$");
            int PosFrame = searchID(newFrameID);
            if (PosFrame < 0) {
                System.out.println("Frame ID not exist!");
            } else {
                System.out.println("Frame ID duplicated!");
            }
            newEngineID = MyToys.checkformat("Enter Engine ID(E00000): ", "Wrong format!", "^[E|d]\\d{5}$");
            int PosEngine = searchID(newEngineID);
            if (PosEngine < 0) {
                System.out.println("Engine ID not exist!");
            } else {
                System.out.println("Engine ID duplicated!");
            }

            listCar.add(new Car(newCarID, b, newColor, newFrameID, newEngineID));
            System.out.println("Car " + newCarID + " has been added");

        } else {
            System.out.println("Car ID is duplicated. But Car ID can not be duplicated (C05, C08).");
        }

    }

    public void printBasedBrandName() {
        int count = 0;
        System.out.print("Enter a part of Brand Name: ");
        String aPartOfBrandName = sc.nextLine().trim();
        for (int i = 0; i < listCar.size() - 1; i++) {
            Car c = listCar.get(i);
            if (c.getBrand().getBrandName().contains(aPartOfBrandName)) {
                System.out.println(c.screenString());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No car is detected!");
        }
    }

    public boolean removeCar() {
        System.out.println("Enter Car ID to remove: ");
        String removedID = sc.nextLine();
        int pos = searchID(removedID);
        if (pos < 0) {
            System.out.println("Not found!");
            return false;
        } else {
            listCar.remove(pos);
            System.out.println("Moved successfully");
        }
        return true;
    }

    public boolean updateCar() {
        boolean checkFrame;
        boolean checkEngine;
        String newCarID, newColor, newFrameID, newEngineID;
        Brand b;
        System.out.print("Enter Car ID to update: ");
        String updatedID = sc.nextLine();
        int pos = searchID(updatedID);
        if (pos < 0) {
            System.out.println("Not found!");
            return false;
        } else {
            System.out.println("Brand List:");
            b = (Brand) Menu.ref_getChoice(brandList.listB());
            do {
                System.out.print("Enter Color: ");
                newColor = sc.nextLine().trim();
            } while (MyToys.checkSName(newColor) == false && newColor.isEmpty());

            newFrameID = MyToys.checkformat("Enter Frame ID(F00000): ", "Wrong format!", "^[F|d]\\d{5}$");
            int PosFrame = searchID(newFrameID);
            if (PosFrame < 0) {
                System.out.println("Frame ID not exist!");
            } else {
                System.out.println("Frame ID duplicated!");
            }
            newEngineID = MyToys.checkformat("Enter Engine ID(E00000): ", "Wrong format!", "^[E|d]\\d{5}$");
            int PosEngine = searchID(newEngineID);
            if (PosEngine < 0) {
                System.out.println("Engine ID not exist!");
            } else {
                System.out.println("Engine ID duplicated!");
            }
            listCar.get(pos).setBrand(b);
            listCar.get(pos).setColor(newColor);
            listCar.get(pos).setFrameID(newFrameID);
            listCar.get(pos).setEngineID(newEngineID);
        }
        return true;

    }

    public void listCars() {
        if (listCar.isEmpty()) {
            System.out.println("List Car is empty.");
        }
        Comparator sortName = new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().getBrandName().compareToIgnoreCase(o2.getBrand().getBrandName());
            }
        };
        Collections.sort(listCar, sortName);
        for (int i = 0; i < listCar.size(); i++) {
            Car c = listCar.get(i);
            System.out.println(c.screenString());
        }

    }
    
    

}
