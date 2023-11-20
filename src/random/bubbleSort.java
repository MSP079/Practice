package random;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an Array: ");
        int size = sc.nextInt();

        System.out.print("Enter the Array element to be sorted: ");
        int array[] = new int[size];


        //Storing elements in an array
        for(int i=0; i<size; i++){
            array[i]=sc.nextInt();
        }

        //calling bubbleSort function
        sort(array);
        System.out.println();
        sortBubbleReverse(array);

        
    }
    public static void sort(int[] arr){
        
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        // priting the array after the sorting
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void sortBubbleReverse(int arr[]){

        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length- i -1; j++){
                if(arr[j]< arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        //printing the elements after sorting 

        for (int i : arr) {
            System.out.print(i +" ");
        }
    }
    
}
