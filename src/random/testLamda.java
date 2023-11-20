package random;
@FunctionalInterface
interface Car{
   public void drive(int speed, String model);
}
class Audi implements Car{
    public void drive(int speed, String model){
        System.out.println("Driving " + model + " at speed:" + speed);
    }
}

public class testLamda {
    public static void main(String args[]) {
        
        Audi audi = new Audi(); 
        audi.drive(70, "AUDI");
        
        
        Car c1 = new Car(){
           public void drive(int speed, String model){
               System.out.println("Driving " + model + " at speed: "+ speed );
           }
       };
       c1.drive(80, "BMW");
       
      Car c2 = (speed, model) -> System.out.println("Driving " + model + " at speed: " + speed);
      c2.drive(90, "FERRARI");  
    }
}