// import java.io.*;
import java.util.*;

public class rough {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        scn.close();
        int ans = lastIndex(arr, n - 1, x);
        System.out.println(ans);
    }

    public static int lastIndex(int[] arr, int idx, int x) {
        if (idx > 0 && arr[idx] == x) {
            return x;
        } else if (idx < 0) {
            return -1;
        }

        int ans = lastIndex(arr, --idx, x);
        return ans;
    }
    // problem in this code is the last call is of first index hence it will be returned: i guess abhi toh

}