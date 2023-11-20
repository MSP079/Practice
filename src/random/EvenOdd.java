package random;
import java.util.Scanner;
public class EvenOdd{
    static void method1(int number){
        //Force Brute check
        if((number%2) == 0){
            System.out.println("Method1 Number is even");
        }else{
            System.out.println("Method1 Number is odd");
        }
    }
    static void method2(int number){
        //checking with Bitwise OR 
        if((number | 1) > number){
            System.out.println("Method2 Number is even");
        }else{
            System.out.println("Method2 Number is odd");
        }
    }
    static void method3(int number){
         //checking with Bitwise and 
        if((number & 1) == 1){
            System.out.println("Method3 Number is odd");
        }else{
            System.out.println("Method3 Number is even");
        }
    }
    static void method4(int number){
         //checking with Bitwise XOR 
         if((number ^ 1) == number + 1){
            System.out.println("Method4 Number is even");
        }else{
            System.out.println("Method4 Number is odd");
        }
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check even or odd: ");
        int number = sc.nextInt();
        method1(number);
        method2(number);
        method3(number);
        method4(number);
        method5 m5 = (a) -> {
            if(a%2 == 0){
                return "Method5 number is even";
            }else{
                return "Method5 number is odd";
            }
        };
        System.out.println(m5.evenOddCheck(number));
        sc.close();
    }
}


// Lambda Epression interface
@FunctionalInterface
interface method5{
    String evenOddCheck(int number);
}