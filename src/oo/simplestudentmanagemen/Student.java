package oo.simplestudentmanagemen;

import java.util.jar.Attributes.Name;

public class Student {
    //attribute//data
    //bien
    String mssv;
    String tenSinhVien;
    String lop;
    String khoa;
    String thi;
    String phatBieu;
    String nganh;
    double diemTB;

    //method/function
    //constructor: phước thuc đặt biet
    public Student(){
        //this.mssv = "1234";
        ///this.tenSinhVien = "Sang";

    }
    public Student(String name, String mssv){
        tenSinhVien = name ;
        this.mssv = mssv;
    }  
    public Student(String name, String mssv, String lop, String nganh, String diemtTB){
        this(name, mssv);// gọi constructor trong cùng 1 calss
        this.lop = lop;
        this.nganh = nganh;
        this.diemTB = diemTB;
    }
    void show(){
        System.out.println("mã sv"+mssv);
        System.out.println("Tên sinh vien"+tenSinhVien);
        System.out.println("Điểm TB:"+diemTB);
    }
    void hoc(){
        System.out.println("hoc...");
        //thao tac len dư lieu
    }
    void thamGiaHoatDong(){
        System.out.println("Da Bong...");
    }
    public void thi(){
        System.out.println(" dang thi..."+ thi);
    }
    public void phatBieu(){
        System.out.println("Phát biểu"+ phatBieu);
    }
}
