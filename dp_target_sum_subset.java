// import java.io.*;
import java.util.*;

public class dp_target_sum_subset {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        scn.close();

        boolean ans = tss(0, arr, tar, 0);
        System.out.println(ans);

    }

    // ssf = sum so far

    public static boolean tss(int idx, int[] arr, int tar, int ssf) {
        if (ssf == tar) {
            return true;
        } else if (ssf > tar) {
            return false;
        }
        if (idx == arr.length) {
            return false;
        }

        boolean include = tss(idx + 1, arr, tar, ssf + arr[idx]);
        boolean notinclude = tss(idx + 1, arr, tar, ssf);

        if (include == true || notinclude == true) {
            return true;
        }

        return false;
    }
}