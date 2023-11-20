package random;
import java.util.*;

class Number {
   //Write your code here
   double real;
   double imaginary;
   Number(double real, double imaginary){
       this.real = real;
       this.imaginary = imaginary;
   }
   
   public void setRealPart(double real){
       this.real = real;
   }
   
   public void setImaginaryPart(double imaginary){
       this.imaginary = imaginary;
   }
   

  public double getImaginaryPart() {
    //Write your code here
    return this.imaginary;
    }
    
    public double getRealPart(){
        return this.real;
    }
}

class Complex extends Number {
//Write your code here
    
    Complex(double real, double imaginary){
        super(real, imaginary);
    }
    public boolean checkComplex() {
        return imaginary != 0;
    }
    public String formatComplex() {
       
        if(real != 0){
            return real + "+" + (imaginary >= 0 ? "" : "-") + "i" + Math.abs(imaginary);
        }else{
            return (imaginary >= 0 ? "" : "-") + "i" + Math.abs(imaginary);
        }
    }
}

class PurelyImaginary extends Complex {

//Write your code here
public PurelyImaginary(double real, double imaginary) {
        super(real, imaginary);
    }

    public boolean checkPurelyImaginaryNumber() {
        return real == 0;
    }
}

public class realImaginaryEqn {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        double realPart = in.nextDouble();
        double imaginaryPart = in.nextDouble();

        Complex nu = new Complex(realPart, imaginaryPart);
        PurelyImaginary num = new PurelyImaginary(realPart, imaginaryPart);

        System.out.println(num.getImaginaryPart());

        if (nu.checkComplex()) {
            System.out.println("The given number is complex");
            System.out.println(nu.formatComplex());
        } else {
            System.out.println("The given number is real");
            System.out.println(nu.formatComplex());
        }

        if (num.checkPurelyImaginaryNumber()) {
            System.out.println("The number is purely imaginary");
        } else {
            System.out.println("The number is not purely imaginary");
        }

    }
}
 
