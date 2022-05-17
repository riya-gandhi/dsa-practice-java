// import java.io.*;
import java.util.*;

public class print_permutations {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        printPermutations(str, "");

    }

    public static void printPermutations(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            String breakpoint = ""+str.charAt(i);
            String rest_of_string = str.substring(0, i) + str.substring(i + 1);

            printPermutations(rest_of_string, ans+breakpoint);
        }
    }

}