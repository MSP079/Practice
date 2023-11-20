package random;
import java.util.*;

public class Source {
    public static void merge(int[] temp, int l, int r, int m) {
        int i = l, j = m + 1, k = 0;
        int[] temp1 = new int[r - l + 1];
        
        while (i <= m && j <= r) {
            if (temp[i] > temp[j]) {
                temp1[k++] = temp[i++];
            } else {
                temp1[k++] = temp[j++];
            }
        }
        
        while (i <= m) {
            temp1[k++] = temp[i++];
        }
        
        while (j <= r) {
            temp1[k++] = temp[j++];
        }
        
        for (i = l; i <= r; i++) {
            temp[i] = temp1[i - l];
        }
    }
    
    public static void mergeSort(int[] temp, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(temp, l, mid);
            mergeSort(temp, mid + 1, r);
            merge(temp, l, r, mid);
        }
    }
    public static int[] getArrayInput(int size, Scanner scanner) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sizeArray1 = scanner.nextInt();
        int sortedArray1[] = getArrayInput(sizeArray1, scanner);
        int sizeArray2 = scanner.nextInt();
        int sortedArray2[] = getArrayInput(sizeArray2, scanner);

        
    
        int[] temp = new int[sizeArray1 + sizeArray2];
        
        for (int i = 0; i < sizeArray1; i++) {
            temp[i] = sortedArray1[i];
        }
        
        for (int i = 0; i < sizeArray2; i++) {
            temp[sizeArray1 + i] = sortedArray2[i];
        }
        
        int size = temp.length;
        mergeSort(temp, 0, size - 1);
        
        for (int i = 0; i < size; i++) {
            System.out.println(temp[i]);
        }
    }
}