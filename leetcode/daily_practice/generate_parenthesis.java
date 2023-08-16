package leetcode.daily_practice;

import java.util.*;

public class generate_parenthesis {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        ArrayList<String> ans = new ArrayList<>();

        ans = solution(n);

        System.out.print(ans);

    }

    public static ArrayList<String> solution(int n) {
        if (n == 1) {
            ArrayList<String> baseList = new ArrayList<>();
            baseList.add("{}");
            return baseList;
        }

        ArrayList<String> ansList = solution(n - 1);
        System.out.println(ansList);
        ansList.add("[]");
        return ansList;
    }
}
