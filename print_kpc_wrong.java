
// import java.io.*;
import java.util.*;

public class print_kpc_wrong { //this code is wrong approach because it assumes only 2
    //inputs as opposed to 10 inputs which are possible

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();

        String str1 = codes[Integer.parseInt(str.substring(0,1))];
        String str2 = codes[Integer.parseInt(str.substring(1,2))];
        printKPC(str1, str2);

    }

    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKPC(String str1, String str2) {

        if (str1.length() == 0) {
            return;
        }

        String[] arr = str2.split("");
        for (String i : arr) {
            System.out.println(str1.charAt(0) + i);
        }

        printKPC(str1.substring(1), str2);

    }

}