package cses_problem_set.dynamic_programming;

import java.util.Scanner;

public class dice_combinations {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int[] dp = new int[n + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }

        int ans = solve(n);
        System.out.println(ans);
    }

    public static int solve(int n) {
        int MOD = 1000000007;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        int sum = dp[0];

        for (int i = 1; i <= n; i++) {
            dp[i] = sum;
            sum += dp[i];
        }
        return (dp[n] % MOD);
    }

    // public static int solve(int n, int[] dp) {
    // int MOD = 1000000007;

    // if (n <= 0) {
    // if (n == 0) {
    // return 1;
    // } else
    // return 0;
    // }

    // if (dp.length > n) {
    // if (dp[n] != -1) {
    // return dp[n] % MOD;
    // }
    // }

    // int ans = 0;

    // for (int i = 1; i <= 6; i++) {
    // ans += solve(n - i, dp);
    // }

    // dp[n] = ans;
    // return ans;
    // }
}
