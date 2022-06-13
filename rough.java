import java.io.*;
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
        int ans = firstIndex(arr, 0, x);
        System.out.println(ans);
    }

    public static int firstIndex(int[] arr, int idx, int x) {
        if (idx < arr.length && arr[idx] == x) {
            return idx;
        } else if (idx >= arr.length) {
            return -1;
        }

        int ans = firstIndex(arr, ++idx, x);
        return ans;
    }

}