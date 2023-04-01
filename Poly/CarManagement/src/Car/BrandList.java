package Car;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
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
        BufferedReader bf = new BufferedReader(fr);
        String strLine;
        if (!f.exists()) {
            System.out.println("File not exist!");
            return false;
        } else {
            while ((strLine = bf.readLine()) != null) {
                try {
                    StringTokenizer st;
                    st = new StringTokenizer(strLine, ",:");
                    while (st.hasMoreTokens()) {
                        String brandID = st.nextToken();
                        String brandName = st.nextToken();
                        String soundBrand = st.nextToken();
                        double price = Double.parseDouble(st.nextToken());
                        listBrand.add(new Brand(brandID, brandName, soundBrand, price));
                    }
                } catch (Exception e) {
                    bf.close();
                    fr.close();
                    System.out.println(e);
                }
            }
        }

        return true;
    }
    //    public boolean loadFromFile(String filename) throws NullPointerException, FileNotFoundException, IOException {
    //        File f = new File(filename);
    //        FileReader fr = new FileReader(filename);
    //        BufferedReader br = new BufferedReader(fr);
    //
    //        if (!f.exists()) {
    //            System.out.println("file not exist!");
    //            return false;
    //        }
    ////        Scanner scan = new Scanner(new File(filename));
    //        String s;
    //        while ((s = br.readLine()) != null) {
    //
    ////            System.out.println(s);
    //            try {
    //
    //                StringTokenizer st = new StringTokenizer(s, ",:");
    //                while (st.hasMoreTokens()) {
    //                    String id = st.nextToken().trim();
    //                    String name = st.nextToken().trim();
    //                    String sound = st.nextToken().trim();
    //                    double price = Double.parseDouble(st.nextToken());
    //                    listBrand.add(new Brand(id, name, sound, price));
    //
    //                }
    //            } catch (Exception e) {
    //
    //            }
    ////          
    //
    //        }
    //        br.close();
    //        fr.close();
    ////        for(Brand l : list) System.out.println(l);
    //        return true;

    public boolean saveToFile(String filename) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader(filename);
        BufferedReader bf = new BufferedReader(fr);
        if (this.size() == 0) {
            System.out.println("Empty list");
            return false;
        } else {
            for (int i = 0; i < listBrand.size(); i++) {
                String str = "";
                str += listBrand.get(i) + "\n";
                bf.close();
            }
        }
        System.out.println("Save to file successfully!");
        bf.close();
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
        return null;
    }

    public int searchID(String bID) {
        bID = bID.trim().toUpperCase();
        int n = listBrand.size();
        for (int i = 0; i < n; i++) {
            if (this.get(i).getBrandID().equals(bID)) {
                return i;
            }
        }
        return -1;
    }

    public Brand getUserChoice() {
        Menu mnu = new Menu();
        return mnu.ref_getChoice(listBrand);
    }

    public void addBrand() {
        String nBrandID, nBrandName, nSoundBrand;
        double nPrice;
        boolean isDuplicated;
        do {
            isDuplicated = false;
            System.out.print("Enter new Brand ID: ");
            nBrandID = sc.nextLine();
            System.out.print("Enter new Brand Name: ");
            nBrandName = sc.nextLine();
            System.out.print("Enter new Brand Sound: ");
            nSoundBrand = sc.nextLine();
            System.out.print("Enter new Price: ");
            nPrice = Double.parseDouble(sc.nextLine());

            if (search(nBrandID) != null) {
                isDuplicated = true;
                System.out.println("ID is duplicated-------");
            }
            if (nBrandID.isEmpty()) {
                System.out.println("Fill ID-------");
            }
            if (nBrandName.isEmpty()) {
                System.out.println("Fill Name-------");
            }
            if (nSoundBrand.isEmpty()) {
                System.out.println("Fill Sound-------");
            }
            if (nPrice < 0) {
                System.out.println("Price must larger than 0-------");
            }
        } while (nBrandID.isEmpty() || nBrandName.isEmpty() || nSoundBrand.isEmpty() || nPrice < 0);
        Brand brandList = new Brand(nBrandID, nBrandName, nSoundBrand, nPrice);
        listBrand.add(brandList);
        System.out.println("Add successfully!");
    }

    public void updateBrand() {
        String nBrandID, nBrandName, nSoundBrand;
        double nPrice;
        if (listBrand.isEmpty()) {
            System.out.println("Emplist list.");
        } else {
            System.out.print("Enter Brand ID you wan to update: ");
            String upBrandID = sc.nextLine();;
            int pos = searchID(upBrandID);
            if (pos < 0) {
                System.out.println("ID not exist!");
            } else {
                do {
                    System.out.print("Enter new Brand Name: ");
                    nBrandName = sc.nextLine();
                    System.out.print("Enter new Brand Sound: ");
                    nSoundBrand = sc.nextLine();
                    System.out.print("Enter new Price: ");
                    nPrice = Double.parseDouble(sc.nextLine());
                    listBrand.get(pos).setBrandName(nBrandName);
                    listBrand.get(pos).setSoundBrand(nSoundBrand);
                    listBrand.get(pos).setPrice(nPrice);
                    if (nBrandName.isEmpty()) {
                        System.out.println("Fill Name-------");
                    }
                    if (nSoundBrand.isEmpty()) {
                        System.out.println("Fill Sound-------");
                    }
                    if (nPrice < 0) {
                        System.out.println("Price must larger than 0-------");
                    }
                } while (nBrandName.isEmpty() || nSoundBrand.isEmpty() || nPrice < 0);
            }
        }

    }

    public void listBrands() {
        if (listBrand.isEmpty()) {
            System.out.println("Empty List");
        } else {
            int n = listBrand.size();
            for (int i = 0; i < n; i++) {
                System.out.println(this.get(i));
            }

        }
    }

}
