package Arrays;

import java.util.Scanner;

public class peakElement {

    // Geneal approach
    static int peakEle(int arr[], int size){
        
        if(size == 1) return arr[0];

        if(arr[0] > arr[1]) return arr[0];

        if(arr[size-1] > arr[size-2]) return arr[size-1];
        
        //unsorted array method
        
        for(int i=1; i<size-1; i++){
            if(arr[i] > arr[i+1] && arr[i] > arr[i-1]){
                return arr[i];
            }
        }
        return 0;
    }

    //Binary approach

    static int peakWithBinary(int arr[], int left, int right, int size){
        int mid = left + (right - left)/2;

            if((mid == 0 || arr[mid] >= arr[mid-1]) && (mid == right || arr[mid] >= arr[mid +1])){
                return mid;
            }else if(mid < 0 && arr[mid] < arr[mid-1]){
                return peakWithBinary(arr, left, mid-1, size);
            }else 
                return peakWithBinary(arr, mid+1, right, size);
    }

    static int peakWithIterative(int arr[], int left, int right, int n){
        int mid =0;
        while(left<=right){
            mid = (left + right) >> 1;
            
            if(mid == 0 || arr[mid] > arr[mid -1] && mid == n-1 || arr[mid] > arr[mid + 1]){
                break;
            }else if(mid >0 && arr[mid] < arr[mid-1]){
                right = mid -1;
            }else{
                left = mid + 1;
            }
        }
        return mid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = sc.nextInt();

        System.out.print("Enter the elements: ");
        int arr[] = new int[size];

        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("peakEle: " + peakEle(arr, size));
        System.out.println("peakWithBinary at index:  " + peakWithBinary(arr, 0, size-1, size));
        System.out.println("peakWithIterative at index: " +  peakWithIterative(arr, 0, size-1, size));

        sc.close();
    }
}
