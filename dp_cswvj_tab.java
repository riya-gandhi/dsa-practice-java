import java.util.*;
// import java.io.*;

public class dp_cswvj_tab {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        scn.close();

        int[] dp = new int[n+1];
        
        dp[n] = 1;

        for(int i=n-1;i>=0;i--){

            int paths = 0;
            for(int j=1;j<=arr[i];j++){

                if(i+j<dp.length){
                    paths += dp[i+j];
                }
                
            }
            dp[i] = paths;
        }

        System.out.println(dp[0]);

    }
}