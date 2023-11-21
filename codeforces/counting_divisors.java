package codeforces;
// https://cses.fi/problemset/task/1713/

import java.util.Scanner;

public class counting_divisors {

    public static int solve(int n) {

        int ans = 2;

        for (int i = n - 1; i >= 2; i--) {
            if (n % i == 0) {
                ans++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        while (t-- > 0) {
            int i = scn.nextInt();

            int ans = solve(i);

            System.out.println(ans);

        }

        scn.close();
    }

}
