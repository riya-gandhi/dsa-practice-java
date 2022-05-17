// import java.io.*;
import java.util.*;

public class get_stair_paths {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        ArrayList<String> ans_list = getStairPaths(n);
        System.out.println(ans_list);

    }

    public static ArrayList<String> getStairPaths(int n) {

        if (n == 0) {
            ArrayList<String> positive_base_list = new ArrayList<>();
            positive_base_list.add("");
            return positive_base_list;
        }
        else if (n < 0) {
            ArrayList<String> negative_base_list = new ArrayList<>();
            return negative_base_list;
        }
        
        ArrayList<String> path1 = getStairPaths(n - 1);
        ArrayList<String> path2 = getStairPaths(n - 2);
        ArrayList<String> path3 = getStairPaths(n - 3);

        ArrayList<String> paths = new ArrayList<>();

        for (String i : path1) {
            paths.add(1 + i);
        }
        for (String i : path2) {
            paths.add(2 + i);
        }
        for (String i : path3) {
            paths.add(3 + i);
        }

        return paths;
    }

}