// import java.io.*;
import java.util.*;

public class dp_count_binary_strings {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int ans = cbs(" ", n);
        System.out.println(ans);
    }

    public static int cbs(String ssf, int n) {

        if (ssf.length() == n + 1) {
            // System.out.println(ssf);
            return 1;
        }

        int totalans = 0;

        if (ssf.substring(0, 1).equals("0") == false) {
            totalans += cbs("0" + ssf, n);
        }
        totalans += cbs("1" + ssf, n);

        return totalans;
    }

}