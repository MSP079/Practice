package random;
import java.util.*;

public class commonElementInRow {

    public static void printElementInAllRows(int mat[][]) {

        for(int i = 0; i < mat.length; i++) {
            Arrays.sort(mat[i]);
        }
        
        int cnt = 1;
        for(int i = 0; i < mat[0].length; i++) {
            boolean isPre = true;
            
            if(i != 0) {
                if(mat[0][i] == mat[0][i-1]) {
                    cnt++;
                }else {
                    cnt = 1;
                }
            }
            
            //System.out.println(mat[0][i]+" *** ");
            
            for(int j = 1; j < mat.length; j++) {
                int tmpCnt = 0;
                for(int k = 0; k < mat[j].length; k++) {
                    
                    if(mat[j][k] == mat[0][i]) {
                        tmpCnt++;
                        if(tmpCnt == cnt) {
                            break;
                        }else {
                            continue;
                        }
                    }
                    
                    if(mat[j][k] > mat[0][i] || k == mat[j].length - 1) {
                        isPre = false;
                        break;
                    }
                }
                
                if(!isPre) {
                    break;
                }
            }
            
            if(isPre) {
                System.out.print(mat[0][i]+" ");
            }
        }  
        
    }
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        
        int matrix[][] = new int[row][col];
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        printElementInAllRows(matrix);
    }
}