import java.io.*;
import java.util.*;

public class stack_sliding {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        // code

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        if (arr.length > k) {

            int[] ans = new int[arr.length];
            for (int i = 0; i < k; i++) {
                pq.add(arr[i]);
            }

            for (int i = 0; i < arr.length; i++) {

                ans[i] = pq.remove();
                if (i + k < arr.length) {
                    pq.add(arr[i + k]);
                }
            }
            System.out.println(ans);

        } else {
            for (int i : arr) {
                pq.add(i);
            }
            int[] ans = new int[arr.length];

            for (int i : ans) {
                i = pq.peek();
            }

            System.out.println(ans);
        }

    }
}
