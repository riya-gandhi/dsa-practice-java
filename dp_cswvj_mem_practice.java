// import java.io.*;
import java.util.*;

public class dp_cswvj_mem_practice {

    public static void main(String[] args) throws Exception {
        // write your code here
        // things to take care
        // we are going from 0th step to nth step 
        // and ways wont be same as viceversa
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n+1];
        
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        scn.close();
        
        int ans = cs(0,arr,dp);
        System.out.println(ans);
    }
    
    public static int cs(int idx,int[] arr, int[] dp){
        
        if(idx>=arr.length){
            if(idx==arr.length){
                return 1;
            }
            else return 0;
        }
        if(dp[idx]!=0){
            return dp[idx];
        }
        
        int totalpaths = 0;
        
        
        for(int i=1;i<=arr[idx];i++){
            int ifpath = cs(idx+i,arr,dp);
            totalpaths += ifpath;
        }
        
        dp[idx] = totalpaths;
        
        return totalpaths;
    }

}