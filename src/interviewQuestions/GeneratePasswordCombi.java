package interviewQuestions;

import java.util.Scanner; 
  
public class GeneratePasswordCombi 
{ 
    static void genPW(char[] arr, int n) 
    { 
        //Write code here 
        //array as one character 
        if(n==1) System.out.print(arr[0] + " ");
        
        //array as more than one character
        if(n>=2){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.println(arr[i] + arr[j]);
                }
            }
        }
    } 
  
    public static void main(String[] args) 
    { 
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        char arr[] = new char[n];
        for(int i = 0; i < n; i++)
            arr[i] = s.next().charAt(0);
        genPW(arr, n);
        s.close();
    }
}