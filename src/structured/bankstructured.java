package structured;

import java.util.Scanner;

public class bankstructured {
    //data
    //bien toan cuc : global    
    static int sotk = 12345;
    static int sodu = 0; 
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("nhap so tien muon gui:");
        int sotien = input.nextInt();
        sodu += sotien;
        show();

        //rut tien
        int withdrawAmount = 0;
        System.out.println("nhap so tien muon rut:");
        withdrawAmount = input.nextInt();
        sodu -= withdrawAmount;
        show();

        //with draw : rut tien
        System.out.println("nhap so tien muon rut:");
        withdrawAmount = input.nextInt();
        sodu -= withdrawAmount;
        show();
    }
    static void show(){
        System.out.println("thong tin tai khoan:");
        System.out.println("ten tai khoan:" + sotk);
        System.out.println("so du tai khoan:"+ sodu);
    }
   
} 