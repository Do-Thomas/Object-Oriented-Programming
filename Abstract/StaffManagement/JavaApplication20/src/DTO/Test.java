
package DTO;

import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many staff in company: ");
        int n = Integer.parseInt(sc.nextLine());
        Staff[] Sf = new Staff[n];

        System.out.println("Input information Staff");
        
        double All = 0;     //tinhLuong trung binh toàn công ty
        double avg;
        
        for (int i = 0; i < n; i++) {
            System.out.print("Choose 1(Staff Marketing) or 2(Staff Administration): ");
            System.out.println("Staff " + (i + 1) + "/" + n);    
            int choose = sc.nextInt();
            if (choose == 1) {
                Sf[i] = new Marketing();
            } else if (choose == 2) {
                Sf[i] = new Administration();
            }
            Sf[i].inputStaff();
            Sf[i].calculateSalary();
            
        }
        for (int i = 0; i < n; i++) {
            System.out.println("================================================");
            Sf[i].show();
        }
             
        for (int i = 0; i < n; i++) {
            All += Sf[i].calculateSalary();
        }
        avg = All / n;
        System.out.println("Average: " + avg);
        double max = 0;
        for (int i = 0; i < n; i++) {
            if(max <  Sf[i].calculateSalary())
                max  = Sf[i].calculateSalary();
        }
        System.out.println("Max salary in company: " + max);
    }
}
