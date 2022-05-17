// import java.io.*;
import java.util.*;

public class print_maze_path_with_jumps {

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

        if (dr == sr && dc == sc) {
            System.out.println(ans);
            return;
        }

        for (int i = 1; i <= dc-sc; i++) {
            
            printMazePaths(sr, sc+i, dr, dc, ans + "h" +i);
        }
        for (int i = 1; i <= dr-sr; i++) {

            printMazePaths(sr+i, sc, dr, dc, ans + "v" + i);
        }
        for (int i = 1; i <= dr-sr && i <= dc-sc; i++) {
            
            printMazePaths(sr+i, sc+i, dr, dc, ans + "d" +i);
        }
        
        return;

    }

}