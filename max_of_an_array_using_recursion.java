// import java.io.*;
import java.util.*;

public class max_of_an_array_using_recursion {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        scn.close();

        int max = maxOfArray(arr, 0);
        System.out.println(max);

    }

    public static int maxOfArray(int[] arr, int idx) {

        if(idx == arr.length - 1){
            return arr[idx];
        }

        int mosa = maxOfArray(arr, idx+1);
        if(mosa>arr[idx]){
            return mosa;
        }
        else{
            return arr[idx];
        }

    }

}