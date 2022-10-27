// import java.io.*;
import java.util.*;

public class dp_min_cost_maze_tab {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int[][] arr = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        
        int[][] dp = new int[n][m];
        
        // filling the last row and last col
        dp[n-1][m-1] = arr[n-1][m-1];
        
        for(int i = m-2;i>=0;i--){
            dp[n-1][i] = arr[n-1][i] + dp[n-1][i+1];
        }
        for(int i = n-2;i>=0;i--){
            dp[i][m-1] = arr[i][m-1] + dp[i+1][m-1];
        }
        
        // filling the rest of the rows using min(h,v)+arr[i][j]
        
        for(int i = n-2;i>=0;i--){
            for(int j= m-2; j>=0;j--){
                dp[i][j] = Math.min(dp[i+1][j],dp[i][j+1]) + arr[i][j];
            }
        }
        
        System.out.println(dp[0][0]);
        
    }

}