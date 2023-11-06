package codeforces;

import java.util.Scanner;

public class three_numbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int s = scn.nextInt();
        scn.close();

        // brute
        int ans = 0;

        for (int i = 0; i <= k; i++) {
            for (int j = 0; j <= k; j++) {

                int z = s - i - j; // this statement reduced one loop

                if (z >= 0 && z <= k) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}