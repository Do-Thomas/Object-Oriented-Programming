package DTO;

import java.util.Scanner;
import DTO.Administration;
import DTO.Marketing;
import DTO.Staff;
import java.util.ArrayList;

public class StaffManager extends ArrayList<Staff> {

    int[] Staff;
    int count; // sĩ số nhân viên
    double total;
    String name;
    int Id;
    double baSalary;    //lương căn bản
    double nSalary;        //hệ số lương
    double takeHomepay; // lương thực lãnh: lương thực tế, lương ròng
    double seniority; // thâm niên công tác

    double Sales;
    double Roses;
    double Allowance; // phụ cấp
    private Staff[] Sf = new Staff[100];
    int n = 0;        //sỉ số nhân viên = 0

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
            int choose = sc.nextInt();
            System.out.println("Staff " + (i + 1) + "/" + n);
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
            if (max < Sf[i].calculateSalary()) {
                max = Sf[i].calculateSalary();
            }
        }
        System.out.println("Max salary in company: " + max);
        System.out.println("Avergae: " + avg);
    }
    
//    public void avgSalary() {
//        double All = 0;     //tinhLuong trung binh toàn công ty
//        double avg;
//        for (int i = 0; i < 10; i++) {
//           All += Sf[i].calculateSalary();
//        }
//        System.out.println("n =  " + n);
//        avg = All / n;
//        System.out.println("Average: " + avg);
//        
//    }

}
