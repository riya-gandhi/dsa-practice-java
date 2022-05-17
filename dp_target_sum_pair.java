// import java.io.*;
import java.util.*;

public class dp_target_sum_pair {
 
    public static void main(String [] args){

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        int tsp = scn.nextInt();
        scn.close();

        boolean ans = tspFound(arr, tsp);
        System.out.println(ans);

    }

    public static boolean tspFound(int[] arr, int tsp){
        if(tsp<=0){
            if(tsp==0){
                return true;
            }
            else return false;
        }

        for(int i=0;i<arr.length;i++){
            boolean ans = tspFound(arr, tsp-arr[i]);
            if(ans==true){
                return true;
            }
        }
        return false;
    }
}
