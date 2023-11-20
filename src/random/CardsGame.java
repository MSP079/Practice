package random;

import java.util.*;

class Cards {
    int value;
    String suit;

    public void setCards(String suit, int r) {
        this.value = r;
        this.suit = suit;
    }

    //Write your code here.
    public String getSuit(){
        return suit;
    }

    public void setSuit(String suit){
        this.suit = suit;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public String toString(){
        return suit + " " + value;
    }

    int getSuitPriority(String suitString) {

        //Write your code here.
        String s = suitString;
        switch (s.toLowerCase()) {
            case "spades":
                return 4;
            case "diamonds":
                return 3;
            case "hearts":
                return 2;
            case "clubs":
                return 1;
            default:
                return 0;
        }
    }
    
}

class ClassicGame {
    int points1 = 0;
    int points2 = 0;

    public void game(Cards c1, Cards c2) {

        //Write your code here.
        if(c1.getValue() > c2.getValue()){
            points1++;
        }else if(c2.getValue() > c1.getValue()){
            points2++;
        }else{
            if (c1.getSuit().equals("Spades")) {
                points1++;
            } else if (c2.getSuit().equals("Spades")) {
                points2++;
            } else if (c1.getSuit().equals("Diamonds")) {
                points1++;
            } else if (c2.getSuit().equals("Diamonds")) {
                points2++;
            } else if (c1.getSuit().equals("Hearts")) {
                points1++;
            } else if (c2.getSuit().equals("Hearts")) {
                points2++;
            } else if(c1.getSuit().equals("Clubs")){
                points1++;
            }else {
                points2++;
            }
        }

        System.out.println("points of player 1 :" + " " + points1);
        System.out.println("points of player 2 :" + " " + points2);
    }

}

public class CardsGame {

    public static void main(String[] args) {
        //Two objects (cards) of class Cards
        Cards c1 = new Cards();
        Cards c2 = new Cards();
        Scanner in = new Scanner(System.in);
        //Enter the suit of card 1
        String s1 = in.nextLine();
        c1.setCards(s1, in.nextInt());
        in.nextLine();
        //Enter the suit of card 2
        String s2 = in.nextLine();
        c2.setCards(s2, in.nextInt());
        ClassicGame c = new ClassicGame();

        c.game(c1, c2);
        in.close();
    }
}