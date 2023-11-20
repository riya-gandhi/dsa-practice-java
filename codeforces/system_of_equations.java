package codeforces;

import java.util.Scanner;

public class system_of_equations {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.close();

        int ans = solution(n, m);
        System.out.println(ans);
    }

    public static int solution(int n, int m) {

        int ans = 0;

        for (int a = 0; a * a <= n && a <= m; ++a) {
            int b = n - a * a;
            if (a + b * b == m) {
                ans += 1;
            }
        }
        return ans;
    }
}
