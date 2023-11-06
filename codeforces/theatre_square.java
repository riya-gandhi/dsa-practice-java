package codeforces;

import java.util.*;
// import java.io.*;
// import java.lang.Math;

public class theatre_square {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        long n = scn.nextLong();
        long m = scn.nextLong();
        long a = scn.nextLong();

        scn.close();

        double ans = ((m + a - 1) / a) * ((n + a - 1) / a);

        System.out.println((long)ans);
    }
}