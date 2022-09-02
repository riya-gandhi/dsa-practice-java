// import java.io.*;
import java.util.*;

public class dp_mcimt_mem {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();

        int ans = mcimt(0, 0, n - 1, m - 1, arr, 0); // check
        System.out.println(ans);
    }

    public static int mcimt(int sr, int sc, int dr, int dc, int[][] arr, int cost) {

        if(sr>dr||sc>dc){
            return Integer.MAX_VALUE;
        }

        else if (sr == dr && sc == dc) {
            return cost + arr[dr][dc];
        }

        int costh = mcimt(sr, sc + 1, dr, dc, arr, cost);
        int costv = mcimt(sr + 1, sc, dr, dc, arr, cost);

        int mincost = arr[sr][sc]+ Math.min(costh,costv);

        return mincost;
    }

}