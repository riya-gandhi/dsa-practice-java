// import java.io.*;
import java.util.*;

public class first_index_using_recursion {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        scn.close();

        int ans = firstIndex(arr,0, x);
        System.out.println(ans);


    }

    public static int firstIndex(int[] arr, int idx, int x) {

        //we need first index of x in arr[], if x not in arr[], return -1
        //if we want a value to travel across recursive call, we need to catch the ans using a variable

        if (idx == arr.length) {
            return -1;
        }
        
        int ans = firstIndex(arr, idx+1, x);
        if (x == arr[idx]) {
            return idx;
        }
        else {
            return ans;     //we want ans to travel across recursive calls
        }


        
    }

}
//correct ans:
//mistake i made: Seedha recursion ya ulta recursion mei dikkat
// next question is exact opposite