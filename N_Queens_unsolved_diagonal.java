// import java.io.*;
import java.util.*;

public class N_Queens_unsolved_diagonal {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int[][] arr = new int[n][n];
        nQueens(arr, 0, "");
    }

    static void nQueens(int[][] arr,int row,String asf){
        
        if(row==arr.length){
            System.out.println(asf);
            return;
        }
        
        for(int i=1;i<=arr[0].length;i++){
            
            if(arr[row][i-1]!=1){
                place1(arr,row,i-1);
                nQueens(arr,row+1,asf+row+"-"+i+", ");
                remove1(arr,row,i-1);
            }
        }
    }

    static void place1(int[][]arr,int row,int col){
        
        for(int i=0;i<arr[0].length;i++){
            arr[row][i]=1;
        }
        for(int i=0;i<arr.length;i++){
            arr[i][col]=1;
        }

        // not placed for diagonal
        
        
    }
    static void remove1(int[][]arr,int row,int col){
        
        for(int i=0;i<arr[0].length;i++){
            arr[row][i]=0;
        }
        for(int i=0;i<arr.length;i++){
            arr[i][col]=0;
        }
        // not removed for diagonal
        
    }
}

//