package nontrucuture;

import java.util.Scanner;

public class banknontructure {
        public static void main(String[] args) {
            System.out.println("");
            //data
            int sotk = 2004110053;//số tk
            int sodu = 100000;
    
            // operation: thao tác lên dữ liệu
            // deposit
            //số tiền gửi nhập từ bàn phím
            Scanner input = new Scanner(System.in);
    
    
            System.out.print("nhap so tien muon gui:");
            int deposits = input.nextInt();
            sodu += deposits;
            // show data
            System.out.println("account information:");
            System.out.println("account number:"+sotk);
            System.out.println("account balance:"+sodu);
            //with drawl: rut tien
            int withdrawAmount = 0;
            System.out.println("nhap so tien muon rut>");
            withdrawAmount = input.nextInt();
            sodu = withdrawAmount;
    
            //show
            System.out.println("thong tin tai khoan:");
            System.out.println("account number :"+sotk);
            System.out.println("account balance:"+sodu);
    
            //with draw: rut tien
            System.out.print("nhap so tien muon rut>");
            withdrawAmount = input.nextInt();
            sodu -= withdrawAmount;
            //show
            System.out.println("thong tin tai khoan:");
            System.out.println("account number:"+sotk);
            System.out.println("account balance:"+sodu);
        }

    
}
