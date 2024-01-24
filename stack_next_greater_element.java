import java.util.*;
// import java.io.*;

public class stack_next_greater_element {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();

        int[] ans = nge1(arr);
        System.out.println(ans);
    }

    public static int[] nge1(int[] arr) {

        int[] ans = new int[arr.length];
        ans[arr.length - 1] = -1;
        Stack<Integer> stack = new Stack<>();

        for (int i = arr.length - 2; i > 0; i--) {
            if (stack.size() > 0) {
                if(stack.peek()>arr[i]){
                    ans[i] = stack.peek();
                }
                else {
                    while(stack.size()>0){
                        stack.pop();
                        if (stack.peek() > arr[i]) {
                            ans[i] = stack.peek();
                            continue;
                        }
                    }
                }
            } else {
                ans[i] = -1;
            }
        }

        return ans;
    }
}
