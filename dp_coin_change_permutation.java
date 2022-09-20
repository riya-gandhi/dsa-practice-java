// import java.io.*;
import java.util.*;

public class dp_coin_change_permutation {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        scn.close();

        int ans = ccc(arr, tar);
        System.out.println(ans);

    }

    public static int ccc(int[] arr, int tar) {

        if (tar <= 0) {
            if (tar == 0) {
                return 1;
            } else
                return 0;
        }

        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int rres = ccc(arr, tar - arr[i]);
            ans += rres;
        }
        return ans;
    }

}