package cses_problem_set.dynamic_programming;

import java.util.Scanner;

public class dice_combinations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int ans = solve(n);
        System.out.println(ans);
    }

    public static int solve(int n) {
        if (n <= 0) {
            if (n == 0) {
                return 1;
            } else
                return 0;
        }

        int ans = 0;

        for (int i = 1; i <= 6; i++) {
            ans += solve(n - i);
        }

        return ans;
    }
}
