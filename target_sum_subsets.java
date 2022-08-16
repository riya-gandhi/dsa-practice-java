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