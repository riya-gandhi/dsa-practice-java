// import java.io.*;
import java.util.*;

public class dp_arrange_buildings {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = ab(" ", n);
        scn.close();
        System.out.println(ans * ans);
    }

    public static int ab(String str, int n) {

        if (str.length() == n + 1) {
            return 1;
        }

        int ans = 0;

        if (str.substring(0, 1).equals("0") == false) {
            ans += ab("0" + str, n);
        }
        ans += ab("1" + str, n);

        return ans;
    }

}