// import java.io.*;
import java.util.*;

public class dp_climb_stairs {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] dp = new int[n + 1];
        int ans = climbStairs(n, dp);
        System.out.println(ans);
        scn.close();
    }

    static int climbStairs(int n, int[] dp) {

        if (n <= 0) {
            if (n == 0) {
                return 1;
            } else
                return 0;
        }

        if (dp[n] != 0) {
            return dp[n];
        }

        int path1 = climbStairs(n - 1, dp);
        int path2 = climbStairs(n - 2, dp);
        int path3 = climbStairs(n - 3, dp);

        int ans = path1 + path2 + path3;
        dp[n] = ans;

        return ans;
    }

}