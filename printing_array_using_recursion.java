// import java.io.*;
import java.util.*;

public class printing_array_using_recursion {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }

        displayArr(arr, n-1);   // why did i pass n-1, coz arr[idx ]  will give error for arr[n]
        scn.close();

    }

    public static void displayArr(int[] arr, int idx) {
        if(idx<0){
            return;
        }

        displayArr(arr, idx-1);
        System.out.println(arr[idx]);
    }

}