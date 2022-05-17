// import java.io.*;
import java.util.*;

public class get_maze_path_with_jumps {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.close();

        ArrayList<String> ans_list = getMazePaths(0, 0, n-1, m-1);
        System.out.println(ans_list);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if (dr == 0 && dc == 0) {
            ArrayList<String> base_list = new ArrayList<>();
            base_list.add("");
            return base_list;
        }
        else if (dr < 0 || dc < 0) {
            ArrayList<String> negative_base_list = new ArrayList<>();
            return negative_base_list;
        }

        ArrayList<String> ans_path = new ArrayList<>();

        for (int i = dc; i > 0; i--) {
            ArrayList<String> h_path = getMazePaths(sr, sc, dr, dc - 1);
            for (String val : h_path) {
                ans_path.add("h" + i + val);
            }
        }
        for (int j = dr; j > 0; j--) {
            ArrayList<String> v_path = getMazePaths(sr, sc, dr - 1, dc);
            for (String val : v_path) {
                ans_path.add("v" + j + val);
            }
        }
        for (int k = dc; k > 0; k--) {
            ArrayList<String> d_path = getMazePaths(sr, sc, dr - 1, dc - 1);
            for (String val : d_path) {
                ans_path.add("d" + k + val);
            }
        }

        return ans_path;


    }

}