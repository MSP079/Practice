package random;
import java.util.Scanner;
public class test {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array: ");
      int size = sc.nextInt();
      System.out.println("Enter " + size + " elements: ");
      int array[] = new int[size];
      //storing array elements through for loop
      for(int i=0; i< size; i++){
          array[i] = sc.nextInt();
      }
      sc.close();
      //calling PeekElement() method 
      System.out.println(PeekElement(array, size));
    }
    public static int PeekElement(int[] arr, int n){
        //First or Last element is a peek element
        if(n == 1){
            return 0;
        }
        
        if(arr[n-1]>= arr[n-2]){
            return n-1;
        }
        if(arr[0] >= arr[1]){
            return 0;
        }
        // Check for every other element
        for(int i=1; i<n-1; i++){
            if(arr[i] >= arr[i-1] && arr[i] >= arr[i+1]){
                return i;
            }
        }
        return 0;
    }
}