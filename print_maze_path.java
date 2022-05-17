// import java.io.*;
import java.util.*;

public class print_maze_path {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.close();

        printMazePaths(0, 0, n-1, m-1, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String ans) {

        if (dr == 0 && dc == 0) {
            System.out.println(ans);
            return;
        }
        if (dr < 0 || dc < 0) {
            return;
        }

        
        printMazePaths(0, 0, dr, dc - 1, ans + "h");
        printMazePaths(0, 0, dr - 1, dc, ans + "v");
        return;

    }

}