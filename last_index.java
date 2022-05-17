// import java.io.*;
import java.util.*;

public class last_index {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        
        int ans = lastIndex(arr, n - 1, x);
        System.out.println(ans);
        scn.close();
    }

    public static int lastIndex(int[] arr, int idx, int x) {

        if (idx < 0) {
            return -1;
        }
        int ans = lastIndex(arr, idx - 1, x);
        if (x == arr[idx]) {
            return idx;
        }
        else {
            return ans;
        }
    }

}
/* --------------------------------note sir code----------------------------------------------
public static int lastIndex(int[] arr, int idx, int x) {
  if (idx == arr.length) {
    return -1;

  }

  int liisa = lastIndex(arr, idx + 1, x);
  if (liisa == -1) {
    if (arr[idx] == x) {
      return idx;
    } else {
      return -1;
    }
    else {
      return liisa;
    }
  }
*/