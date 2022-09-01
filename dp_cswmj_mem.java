// import java.io.*;
import java.util.*;

public class dp_cswmj_mem {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        scn.close();

        int ans = cswmj(0, n, arr, 0);
        System.out.println(ans);
    }

    public static int cswmj(int idx, int n, int[] arr, int callcount) {

        if (idx == n) {
            return callcount;
        }

        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= arr[idx]; i++) {
            if (idx + i <= n) {
                int recursionResult = cswmj(idx + i, n, arr, callcount + 1);
                if (recursionResult < min) {
                    min = recursionResult;
                }
            } else
                break;
        }

        return min;

    }

}