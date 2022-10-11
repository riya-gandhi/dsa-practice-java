// import java.io.*;
import java.util.*;

public class dp_climb_stairs_tab {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] dp = new int[n+1];
        scn.close();
        
        if(n>=1){
            dp[0] = 1;
            if(n>=2){
                dp[1] = 1;
                if(n>=3){
                    dp[2] = 2;
                }
            }
        }
        
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3];
        }
        
        System.out.println(dp[n]);
        
    }

}