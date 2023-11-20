package random;
import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        System.out.print("Enter the array elements: ");
        int array[] = new int[size];

        //storing the array elements:
        for(int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }

        sortQuick(array);
        sc.close();
    }
    

    public static void sortQuick(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[smallest] > arr[j]){
                    smallest= j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        //printing the array element after sorting 

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
