// import java.io.*;
import java.util.*;

public class get_maze_path {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.close();

        ArrayList<String> ans_list = getMazePaths(0, 0, n - 1, m - 1);
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
        
        ArrayList<String> h_list = getMazePaths(sr, sc, dr, dc - 1);
        ArrayList<String> v_list = getMazePaths(sr, sc, dr - 1, dc);

        ArrayList<String> ans_list = new ArrayList<>();

        for (String i : h_list) {
            ans_list.add("h" + i);
        }
        for (String i : v_list) {
            ans_list.add("v" + i);
        }

        return ans_list;


    }

}