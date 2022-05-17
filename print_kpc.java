// import java.io.*;
import java.util.*;

public class print_kpc {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);

        String str = scn.next();
        scn.close();

        printKPC(str, "");  //initially ans string is blank
    }
    
    static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printKPC(String str, String ans) {

        if (str.length() == 0) {

            System.out.println(ans);
            return;
        }

        String string_to_be_iterated_over = codes[Integer.parseInt(str.substring(0, 1))];

        String[] temp = string_to_be_iterated_over.split("");

        for (String i : temp) {
            printKPC(str.substring(1), ans+i);
        }

    }

}