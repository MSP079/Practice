package Arrays;

import java.util.Scanner;

public class ArraySummation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = input.nextInt();
        System.out.println("Enter array elements");
        int array[]  = new int[size];

        //Method calling 
        //creating class object 
        ArraySummation obj = new ArraySummation();
        System.out.println(obj.method(array));
        input.close();
    }
    int method(int[] array){
        int length = array.length-1;
         int sum =0;
        for(int i =length; i>=0; i--){
            sum = sum + array[i];
            array[i] = sum;
        }
        return sum;
    }
}
