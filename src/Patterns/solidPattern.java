package Patterns;

import java. util.Scanner;

public class solidPattern {


    //Solid Rectangle pattern 
    static void Rectangle(int m){
        
        System.out.println();


        int n = m*2;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


   
     //Solid Square pattern
    static void Square(int n){
        
        System.out.println();


        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of side : ");

        int number = sc.nextInt();
        
        Rectangle(number);
        Square(number);
        sc.close();
    }
}