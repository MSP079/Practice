package random;
import java.util.Scanner;
import java.util.Arrays;

public class SolutionB {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        
    
      Scanner input = new Scanner(System.in);

        // size of the array
        int n = input.nextInt();

        //target element
        int m = input.nextInt();

        // array of ID's declaration
        int[] arrayId = new int[n+1];

        int length = (int) Arrays.stream(arrayId).count();

        //array elements filling
        for(int i=1; i<length; i++){
            arrayId[i] = input.nextInt();
        }

        

        int result = firstOccurence(arrayId, m);

        if(result == -1){
            System.out.println("NOT_FOUND");
        }else{
            System.out.println(result);
        }

        input.close();
    }

    public static int firstOccurence(int arr[], int x){
        int start =1; 
        int end = (int) Arrays.stream(arr).count()-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] < x){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}
