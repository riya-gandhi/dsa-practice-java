package codeforces;

// https://www.hackerrank.com/challenges/number-groups/problem
// passed in js python


import java.util.Scanner;

public class number_groups_hkrnk {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int gn = 1 + ((n - 1) * n);

        int sn = n * (gn + n - 1);

        System.out.println(sn);

    }
}
