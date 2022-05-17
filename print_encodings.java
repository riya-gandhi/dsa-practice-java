// import java.io.*;
import java.util.*;

public class print_encodings {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        printEncodings(str, "");
        //i changed the original signature of the function by adding a String parameter
    }

    public static void printEncodings(String str, String ans) {

        //call from first and first 2 char[only if <= 26]
        //if encounter 0 as str.charAt(0) - print nothing - ans becomes nothing overall

        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        else if (str.length() == 1) {

            if (str.charAt(0) == '0') {
                return;
            } else {

                char temp = (char) ('a' + Integer.parseInt(str.charAt(0) + "")-1);
                printEncodings(str.substring(1), ans + temp);
                return;
            }
        }
        
        else {

            if (str.charAt(0) == '0') {
                return;
            } else {

                char temp1 = (char) ('a' + Integer.parseInt(str.charAt(0) + "")-1);
                printEncodings(str.substring(1), ans + temp1);
            }
            
            int call12 = Integer.parseInt(str.substring(0, 2));
            if (call12 <= 26) {
                char temp2 = (char) ('a' + call12-1);
                printEncodings(str.substring(2), ans + temp2);
            }
        }
    }
}