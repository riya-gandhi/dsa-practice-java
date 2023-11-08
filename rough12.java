import java.util.*;
// import java.io.*;

public class rough12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        // a>=b and b>1
        scn.close();

        // int quotient = 0;
        // int i = a;

        // if a = 5

        // while (a >= b) {
        // a = a - b;
        // quotient = quotient + 1;
        // }

        // b * x = a
        // we need x

        // left, right and terminating

        // int x = 0;
        int left = 1; //err
        int right = a;
        int mid = 0;

        // mid = right+left/2
        // a = 5
        // b = 2
        // l=2
        //r=5
        //m=3

        while (left <= right) {
            mid = (left + right) / 2;
            if (b * mid == a) {
                // quotient = mid;
                break;
            } else if (b * mid < a) {
                left = mid;
            } else
                right = mid;
        }

        // while( b<=a){
        // for (int i = 1; b <= a; i++) {
        // b = b * i;
        // quotient++;
        // }
        // }

        // System.out.println(quotient);

    }
}
