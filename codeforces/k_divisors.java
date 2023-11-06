package codeforces;

import java.util.ArrayList;
import java.util.Scanner;

// first brute force
// then optimization

public class k_divisors {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1;i<=n;i++){
            if(n%i == 0)    {
                list.add(i);
            }
        }

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
