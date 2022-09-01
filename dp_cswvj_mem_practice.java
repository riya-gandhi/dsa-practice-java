import java.io.*;
import java.util.*;

public class dp_cswvj_mem_practice {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        
        int ans = cs(n,0,arr);
        System.out.println(ans);
    }
    
    static int cs(int n,int idx,int[] arr){
        
        if(idx==n){
            return 1; // check if same ans for going from 0 to n >> n to 0
        }
        
        int paths = 0;
        
        for(int i=1;i<=arr[idx];i++){ // this condition was wrong by me
            if(idx+i<=n){               // this condition was wrong by me
                paths += cs(n,idx+i,arr);
            }
            
            else break;
        }
        
        return paths;
    }

}