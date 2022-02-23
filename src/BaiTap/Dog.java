/*
*  created date : Feb 21,2022
*  author cgm
*/
package BaiTap;

public class Dog {
    // attribute - date - biến đối tượng
    // interface (lộ) => implementation ( che giấu)
    private int size;//implementation
    String breed;//interface
    String name;//interface

    //=> lộ dữ liệu

    //method behavior

    //interface
    public void setSize(int size){
        if (size > 0){
            this.size = size;
            else{
                System.out.println("Kính Thước Không Hợp Lệ!!!");
            }
        }
        
    }
    public int getSize(){
        return this.size;
    }
    public void setBreed(int breed){
        this.breed = breed;
    }
    public void getBreed(){
        return this.breed;
    }
    public void setName(int name){
        this.name = name;
    }
    public void getName(){
        return this.name;
    }
}
