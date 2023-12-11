package Patterns;

import java. util.Scanner;

public class solidPattern {

    //Solid Rectangle pattern 
    static void rectangle(int m) {
        System.out.println();
        System.out.println("Rectangle Pattern");
        System.out.println();
        int n = m*2;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

     //Solid Square pattern
    static void square(int n){
        System.out.println();
        System.out.println("Square Pattern");
        System.out.println();
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    //Solid Right Angled Triangle pattern
    static void rightAngledTriangle(int n) {
        System.out.println();
        System.out.println("Right Angled Triangle Pattern");
        System.out.println();
        for(int i=1; i<=n; i++) {
            for(int j=n; j>i; j--) {
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

     //Solid Right side Triangle pattern
    static void rightSideTriangle(int n) {
        System.out.println();
        System.out.println("Right side Triangle Pattern");
        System.out.println();
        for(int i=1; i<=n; i++) {
            for(int k=1; k<i; k++) {
                System.out.print("  ");
            }
            for(int j=n; j>=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //Solid Incresing Triangle pattern
    static void increasingTriangle(int n) {
        System.out.println();
        System.out.println("Incresing Triangle Pattern");
        System.out.println();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            for(int k=1; k<=n; k++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    //Solid Decresing Triangle pattern
    static void decreasingTriangle(int n) {
        System.out.println();
        System.out.println("decreasingTriangle Pattern");
        System.out.println();
        for(int i=1; i<=n; i++) {
            for(int j=n; j>=i; j--) {
                System.out.print("* ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    //Solid hill pattern
    static void hill(int n) {
        System.out.println();
        System.out.println("hill Pattern");
        System.out.println();
        for(int i=1; i<=n; i++) {
            for(int j=n; j>i; j--) {
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("* ");
            }

            for(int j=1; j<i; j++) {
                System.out.print("* ");
            }
            for(int k=1; k<=n; k++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    //Solid reverse hill pattern
    static void reverseHill(int n) {
        System.out.println();
        System.out.println("Reverse Hill pattern");
        System.out.println();
        for(int i=1; i<=n; i++) {
            for(int k=1; k<i; k++) {
                System.out.print("  ");
            }
            for(int j=n; j>=i; j--) {
                System.out.print("* ");
            }

            for(int j=n; j>i; j--) {
                System.out.print("* ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    //Solid Daimond pattern
    static void daimond(int n) {
        System.out.println();
        System.out.println("daimond Pattern");
        System.out.println();
        for(int i=1; i<n; i++) {
            for(int j=n; j>i; j--) {
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("* ");
            }

            for(int j=1; j<i; j++) {
                System.out.print("* ");
            }
            for(int k=1; k<=n; k++) {
                System.out.print("  ");
            }
            System.out.println();
        }

        for(int i=1; i<=n; i++) {
            for(int k=1; k<i; k++) {
                System.out.print("  ");
            }
            for(int j=n; j>=i; j--) {
                System.out.print("* ");
            }

            for(int j=n; j>i; j--) {
                System.out.print("* ");
            }
            for(int k=1; k<=i; k++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }
   

    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of side : ");

        int number = sc.nextInt();
        
        rectangle(number);
        square(number);
        rightAngledTriangle(number);
        rightSideTriangle(number);
        increasingTriangle(number);
        decreasingTriangle(number);
        hill(number);
        reverseHill(number);
        daimond(number);
         
        sc.close();
    }
}