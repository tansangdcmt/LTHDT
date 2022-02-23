package BaiTap;

import javax.swing.plaf.TreeUI;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        int Guessp1 = 0;
        int Guessp2 = 0;
        int Guessp3 = 0;
        boolean p1isRiht = false;
        boolean p2isRiht = false;
        boolean p3isRiht = false;
        int targetNumber = (int) (Math.random()*10);
        System.out.println("I'm thinking of a number between 0 and 9...");
        while (true) {
            System.out.println("number to guess is"+ targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();
            
            Guessp1 = p1.guess;
            System.out.println("Player one guess"+ Guessp1);
            Guessp2 = p2.guess;
            System.out.println("Player two guess"+ Guessp2);
            Guessp3 = p3.guess;
            System.out.println("Player three guess"+ Guessp3);
            
            if (Guessp1 == targetNumber){
                p1isRiht = true;
            }
            if (Guessp2 == targetNumber){
                p2isRiht == true;
            }
            if (Guessp3 == targetNumber){
                p3isRiht == true;
            }
            if (p1isRiht or p2isRiht or p3isRiht){
                System.out.println("We have a winner!");
                System.out.println("Player one got it right?"+p1isRiht);
                System.out.println("Player two got it right?"+p2isRiht);
                System.out.println("Player three got it right?"+p3isRiht);
                System.out.println("Game is over");
                break;
            }
        else{
            System.out.println("Player will have to try agin");
        }
        }


    }
    
}
