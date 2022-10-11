// import java.io.*;
import java.util.*;

public class dp_cswvj_tab2 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n + 1];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        dp[n] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1, count = arr[i]; j < dp.length && count > 0; j++, count--) {
                dp[i] += dp[j];
            }
        }

        System.out.println(dp[0]);
    }

}