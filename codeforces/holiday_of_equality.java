package codeforces;

import java.util.*;

public class holiday_of_equality {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        int ans = sol(arr);
        System.out.println(ans);
    }

    public static int sol(int[] arr) {

        int max = 0, ans = 0;
        Arrays.sort(arr);
        max = arr[arr.length - 1];

        for (int i = 0; i < arr.length; i++) {
            ans += max - arr[i];
        }
        return ans;
    }
}
