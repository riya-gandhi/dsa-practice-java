import java.util.*;
// import java.io.*;

public class dp_cswvjMin_tab {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        Integer[] dp = new Integer[n + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        // min steps to reach nth stair
        // traverse arr[i] times from i : find min
        // dp[i] = min+1;

        dp[n] = 0; // not one 

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 0)    //agar 0 steps possible, toh continue, aage bado
                continue;
            int minsteps = Integer.MAX_VALUE;

            for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {
                
                if (dp[i + j] != null) {    //Integer[not int] array mei by default null hota h
                    minsteps = Math.min(minsteps, dp[i + j]);
                }
            }
            if (minsteps != Integer.MAX_VALUE)  //yahan bhi galat tha meine condition nhi lagaya
                dp[i] = minsteps + 1;
        }

        System.out.println(dp[0]);
    }
}