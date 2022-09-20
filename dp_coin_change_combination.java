
// import java.io.*;
import java.util.*;

public class dp_coin_change_combination {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        int[] dp = new int[tar + 1];
        scn.close();

        int ans = ccc(arr, tar, dp);
        System.out.println(ans);

    }

    public static int ccc(int[] arr, int tar, int[] dp) {
        return 0;
        
    }

}