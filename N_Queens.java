// import java.io.*;
import java.util.*;

public class N_Queens {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int[n][n];
        scn.close();
        
        printNQueens(arr,"",0);
        
    }

    public static void printNQueens(int[][] arr, String qsf, int row) {
        
        if(row==arr.length){
            System.out.println(qsf+".");
            return;
        }
        
        for(int i=1;i<=arr[0].length;i++){
            arr[row][i-1] = 1;
            printNQueens(arr,qsf+row+"-"+i+", ",row+1);
            arr[row][i-1] = 0;
        }
    }
}