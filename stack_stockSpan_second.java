import java.io.*;
import java.util.*;

public class stack_stockSpan_second {
    public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val : a) {
            sb.append(val + "\n");
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int[] span = solve(a);
        display(span);
    }

    public static int[] solve(int[] arr) {
        
        int[] ans = new int[arr.length];
        Stack <Integer> stack = new Stack<>();

        stack.push(arr.length-1);

        for(int i=arr.length-2;i>=0;i--){

            while(stack.size()>0 && arr[i]>= arr[stack.peek()]){
                int pidx = stack.pop();
                ans[pidx] = pidx - i;
            }
            stack.push(i);
        }

        while(stack.size()>0){

            int pidx = stack.pop();
            ans[pidx] = pidx+1;
        }

        return ans;
    }

}