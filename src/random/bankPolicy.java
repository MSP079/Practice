package random;
import java.util.*;

class SavingAmount {
    //write your code here
    private int savings;

    public void setInitialSaving(int savings){
    this.savings = savings;
    }

    public int getCurrentSaving (){
        return savings;
    }

    //An increment method that will increase the savings by Rs.1000 .

    public void incrementSaving() {
            this.savings += 1000;
        }

    //A decrement method that will decrease the savings by Rs.100 .
    public void decrementSaving() {
            this.savings -= 100;
        }


    /*A method to check the savings of a person say 'checkSaving'.
    If the savings amount is greater than or equal to Rs.1000, 
    print “Congratulations! You have saved a good amount”. 
    If the amount is less than Rs.1000 and greater than or equal to 0, print “Insufficient saving!”. 
    If the savings amount is less than 0, print “You are in debt”.*/

    public void checkSaving() {
        if (savings >= 1000) {
            System.out.println("Congratulations! You have saved a good amount");
        } else if (savings >= 0 && savings < 1000) {
            System.out.println("Insufficient saving!");
        } else if(savings < 0){
            System.out.println("You are in debt");
        }
    }

}

public class bankPolicy {
    public static void main(String[] args) {

        SavingAmount obj = new SavingAmount();
        Scanner in = new Scanner(System.in);
        obj.setInitialSaving(in.nextInt());
        obj.decrementSaving();
        obj.incrementSaving();
        obj.checkSaving();
        System.out.println("Your current savings are Rs" + obj.getCurrentSaving());
        in.close();
    }
}