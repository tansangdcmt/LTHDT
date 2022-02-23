package oo.simplestudentmanagemen;

public class StudentTestDrive {
    public static void main(String[] args) {
        //khoi tao doi tuong
        Student phongStudent = new Student();

        phongStudent.thamGiaHoatDong();
        phongStudent.thi();
        phongStudent.show();

        //khai bao 1 bien tham chieu
        Student sonStudent = new Student();
        sonStudent.thamGiaHoatDong();
        sonStudent.phatBieu();
        sonStudent.show();

        //tap doi tuong thu 3

        Student thuStudent = new Student();
        thuStudent.phatBieu();
        thuStudent.thi();

        Student datStudent = new Student("dat","001");

        Student quanStudent = new Student("quan","002");
        
    }
}
