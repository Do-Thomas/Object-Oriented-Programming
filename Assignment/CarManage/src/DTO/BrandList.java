package DTO;


import GUI.Menu;
import DTO.Brand;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class BrandList extends ArrayList<Brand> {

    private ArrayList<Brand> listBrand;
    Scanner sc = new Scanner(System.in);

    public BrandList() {
        listBrand = new ArrayList<Brand>();
    }

    public BrandList(ArrayList<Brand> listBrand) {
        this.listBrand = listBrand;
    }

    public ArrayList<Brand> listB() {
        return listBrand;
    }

    public boolean loadFromFile(String filename) throws NullPointerException, FileNotFoundException, IOException {
        File f = new File(filename);
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        if (!f.exists()) {
            System.out.println("File not exist!");
            return false;
        }
        String s;
        while ((s = br.readLine()) != null) {
            try {

                StringTokenizer st = new StringTokenizer(s, ",:");
                while (st.hasMoreTokens()) {
                    String id = st.nextToken().trim();
                    String name = st.nextToken().trim();
                    String sound = st.nextToken().trim();
                    double price = Double.parseDouble(st.nextToken());
                    listBrand.add(new Brand(id, name, sound, price));

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
        for (int i = 0; i < listBrand.size(); i++) {
            if (listBrand.get(i) != null) {
                String s = "";
                s += listBrand.get(i) + "\n";
                br.write(s);
            }
        }
        System.out.println("Save to file successfully ");
        br.close();
        fr.close();
        return true;
    }

    public Brand search(String ID) {
        ID = ID.trim().toUpperCase();
        for (int i = 0; i < listBrand.size(); i++) {
            if (listBrand.get(i).getBrandID().equals(ID)) {
                return listBrand.get(i);
            }
        }
        System.out.print("Not found\n");
        return null;
    }

    public int searchID(String bID) {
        int n = listBrand.size();
        for (int i = 0; i < n; i++) {
            if (listBrand.get(i).getBrandID().equals(bID)) {
                return i;
            }
        }
        return -1;

    }

    public Brand getUserChoice() {
        Menu mnu = new Menu();
        return (Brand) mnu.ref_getChoice(listBrand);
    }

    public void addBrand() {
        String newBrandID = "";
        String newBrandName = "";
        String newSoundBrand = "";
        double newPrice = 0;
        if (listBrand.isEmpty()) {
            System.out.println("Empty list. No update can be performed!");
        } else {
            System.out.print("Enter Brand ID: ");
            newBrandID = sc.nextLine().trim();
            int Pos = searchID(newBrandID);
            if (Pos < 0) {
                System.out.println("ID can not exist in the list!");
                do {
                    System.out.print("Enter new Brand Name: ");
                    newBrandName = sc.nextLine().trim();
                } while (MyToys.checkSName(newBrandName) == false && newBrandName.isEmpty());

                do {
                    System.out.print("Enter Brand Sound: ");
                    newSoundBrand = sc.nextLine().trim();
                } while (MyToys.checkSName(newSoundBrand) == false && newSoundBrand.isEmpty());

                do {
                    System.out.print("Enter Brand Price(Price > 0): ");
                    newPrice = Double.parseDouble(sc.nextLine());
                } while (newPrice < 0 && MyToys.checkSPrice(newPrice) == false);
                System.out.println("Brand " + newBrandID + " has been added");
            } else {
                System.out.print("Brand ID has duplicated!");
            }
        }
        listBrand.add(new Brand(newBrandID, newBrandName, newSoundBrand, newPrice));
    }

    public void updateBrand() {
        String newBrandID, newBrandName, newSoundBrand;
        double newPrice;
        if (listBrand.isEmpty()) {
            System.out.print("Empty list. No update can be performed!");
        } else {
            System.out.print("Enter Brand ID to update: ");
            String bID = sc.nextLine();
            int Pos = searchID(bID);
            if (Pos < 0) {
                System.out.println("Not Found ID!");
            } else {
                System.out.println("ID found!");
                do {
                    System.out.print("Enter new Brand Name: ");
                    newBrandName = sc.nextLine().trim();
                } while (MyToys.checkSName(newBrandName) == false && newBrandName.isEmpty());
                do {
                    System.out.print("Enter Brand Sound: ");
                    newSoundBrand = sc.nextLine().trim();
                } while (MyToys.checkSName(newSoundBrand) == false && newSoundBrand.isEmpty());

                do {
                    System.out.print("Enter Brand Price(Price > 0): ");
                    newPrice = Double.parseDouble(sc.nextLine());
                } while (newPrice < 0 && MyToys.checkSPrice(newPrice) == false);
                listBrand.get(Pos).setBrandName(newBrandName);
                listBrand.get(Pos).setSoundBrand(newSoundBrand);
                listBrand.get(Pos).setPrice(newPrice);
            }
        }
    }

    public void listBrands() {
        if (listBrand.isEmpty()) {
            System.out.println("Empty list");
        } else {
            System.out.println("Brand list:");
            for (Brand br : listBrand) {
                System.out.println(br);
            }
        }

    }

}
