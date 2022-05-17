// import java.io.*;
import java.util.*;

public class dp_cswvj_mem {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        int[] strg = new int[n + 1];
        for(int i=0;i<strg.length;i++){
            strg[i] = -1;
        }

        int ans = cswvj_mem(0, arr, strg);
        System.out.println(ans);
    }

    public static int cswvj_mem(int n, int[] arr, int[] storage) {

        if (n >= arr.length - 1) {
            if (n == arr.length - 1) {
                return 1;
            } else
                return 0;
        }

        if (storage[n] >= 0) {
            return storage[n];
        }
        
        int jump=0;
        for (int i = 1; i <= arr[n]; i++) {
            int ans = cswvj_mem(n + i, arr, storage);
            jump += ans;
        }
        storage[n] = jump;
        return jump;
    }

}