package random;
import java.util.*;

class Shape{
    public void display(int sides) {
        if (sides == 0) {
            System.out.println("The shape is a circle");
        } else if (sides == 3) {
            System.out.println("The shape is a triangle");
        } else if (sides == 4) {
            System.out.println("The shape is a rectangle");
        } else {
            System.out.println("Enter a valid number of sides!");
        }
    }
}
class Triangle extends Shape{
   
    void display(){
        System.out.println("The shape is a triangle");
    }
}

class Rectangle extends Shape{
    void display(){
         System.out.println("The shape is a rectangle");
    }
}
public class shapesDisplay{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
         int numberOfSides = in.nextInt();
        Shape obj ;
        

        if (numberOfSides == 3) {
            obj = new Triangle();
        } else if (numberOfSides == 4) {
            obj = new Rectangle();
        } else if(numberOfSides == 0){
            obj = new Shape();
        }else{
            obj = new Shape();
        }
       obj.display(numberOfSides);
    }
}


