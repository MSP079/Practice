package random;
import java.util.*;

public class MostFrequentElement {

 public static int mostFrequentElement(int[] arr) {
   HashMap<Integer, Integer> map = new HashMap<>();

    if(arr == null || arr.length ==0) return -1;
    
    for(int i=0; i<arr.length; i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i], map.get(arr[i])+1);
        }else{
            map.put(arr[i],1);
        }
    }
    int max = 0;
    int val = 0;
    for(Integer curr : map.keySet()){
        if(val < map.get(curr)){
            val = map.get(curr);
            max = curr;
        }
    }
    return max;
   
 }



 public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println(mostFrequentElement(arr));
    sc.close();
 }
}