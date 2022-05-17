import java.io.*;
import java.util.*;

public class stack_next_bigger_firstApproach {
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

        int[] nge = solve(a);
        display(nge);
    }

    public static int[] solve(int[] arr) {
        // solve
        // here reverse was beneficial to bring down the complexity from n^2 to n
        // ans required here lies in right hence here reverse is beneficial
        //2 approaches discussed


        int[] ans = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        stack.push(arr[arr.length - 1]);

        for (int i = arr.length - 1; i >= 0; i--) {
            while(stack.size()>0 && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.size()>0){
                ans[i] = stack.peek();
            }
            else{
                ans[i] =-1;
            }

            stack.push(arr[i]);
        }

        return ans;
    }

}