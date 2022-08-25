// why traveral on entire array is necessary
// for tar==2 in [2,0,0]
// poss solutions are[2,0],[2],[0,2];
// my sol would only print [2]

import java.util.*;

public class target_sum_subsets {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        scn.close();

        tss(arr, 0, 0, "", target);

    }

    public static void tss(int[] arr, int idx, int ssf, String psf, int target) {

        if (ssf > target) {
            return;
        }

        if(idx==arr.length){
            if(ssf==target){
                System.out.println(psf+".");
            }
            return;
        }
        tss(arr, idx + 1, ssf + arr[idx], psf + arr[idx] + ", ", target);
        tss(arr, idx + 1, ssf, psf, target);

    }
}

// import java.io.*;
// import java.util.*;

// public class Main {

//     public static void main(String[] args) throws Exception {

//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = scn.nextInt();
//         }
//         int tar = scn.nextInt();

//         scn.close();

//         printTargetSumSubsets(arr, 0, "", 0, tar);

//     }

//     // set is the subset
//     // sos is sum of subset
//     // tar is target
//     public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {

//         if (idx >= arr.length || sos > tar) {
//             return;
//         }
//         if (sos == tar) {
//             System.out.println(set + ".");
//             return;
//         }

//         printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ", ", sos + arr[idx], tar);
//         printTargetSumSubsets(arr, idx + 1, set, sos, tar);

//     }

// }
