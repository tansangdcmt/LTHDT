/*
*  created date : Feb 21,2022
*  author cgm
*/
package BaiTap;

public class DogtestDrive {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setSize(4);//= -1;//vấn đề, không hợp lệ
        dog.breed = "China";
        dog.name = "Bẹc rê";

        System.out.println("Size của chó"+ dog.getSize());
        System.out.println("Nơi sinh sản của chó"+ dog.getBreed());
        System.out.println("Tên của chó"+dog.getName());
}
