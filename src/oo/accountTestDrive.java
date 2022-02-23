package oo;

public class accountTestDrive {
     public static void main(String[] args) {
       account account;
       account = new account();
       
       account.show();
       account.deposit(35000);
       account.show();

       account.withdraw(40000);
       account.show();
    }
}
