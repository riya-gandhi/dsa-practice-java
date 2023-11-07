package codeforces;

import java.util.HashMap;
import java.util.Scanner;

public class beautiful_year {

    public static boolean checkDistinctDigits(int num) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = num;
        boolean flag = true;
        while (i > 0) {
            int lastDigit = i % 10;
            i = i / 10;
            if (map.containsKey(lastDigit)) {
                flag = false;
                break;
            } else {
                map.put(lastDigit, 1);
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int ans = 0;
        for (int i = n + 1; i <= 9012; i++) {   // to handle for the last case
            boolean distinct = checkDistinctDigits(i);
            if (distinct == true) {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
    }
}
