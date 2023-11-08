package codeforces;

import java.util.*;
import java.lang.Math;
 
public class hard_compare {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
 
        long a = scn.nextLong();
        long aPower = scn.nextLong();
        long b = scn.nextLong();
        long bPower = scn.nextLong();
        scn.close();
 
        if (aPower == bPower) {
            if (a > b) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            double a1 = aPower * Math.log(a);
            double b1 = bPower * Math.log(b);
 
            if (a1 > b1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
 
    }
}