package random;
import java.util.Scanner;

public class SolutionA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // size of the array
        int n = input.nextInt();

        // array of ID's declaration
        int[] arrayId = new int[n+1];

        int length = arrayId.length;

        //array elements filling
        for(int i=1; i<length; i++){
            arrayId[i] = input.nextInt();
        }

        

        int result = firstPositive(arrayId,1,length);

        if(result == -1){
            System.out.println("NOT_FOUND");
        }else{
            System.out.println(result);
        }

        input.close();
    }
    
    public static int firstPositive(int arr[], int si, int en){
        int start = si, end = en-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid] == mid){
                return mid;
            }
            else if(arr[mid] > mid){
                  end = mid -1;
            }else{
                start = mid +1;
              
            }
        }
        return -1;
    }
}