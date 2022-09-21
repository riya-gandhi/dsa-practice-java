// import java.io.*;
import java.util.*;

public class dp_count_binary_strings {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        int ans = cbs(" ", n);
        System.out.println(ans);
    }

    public static int cbs(String ssf, int n) {

        if (ssf.length() == n + 1) {
            // System.out.println(ssf);
            return 1;
        }

        int totalans = 0;

        if (ssf.substring(0, 1).equals("0") == false) {
            totalans += cbs("0" + ssf, n);
        }
        totalans += cbs("1" + ssf, n);

        return totalans;
    }

}

/*
 * Both equals() method and the == operator are used to compare two objects in
 * Java. == is an operator and equals() is method. 
 * 
 * But == operator compares
 * reference or memory location of objects in a heap, whether they point to the
 * same location or not.
 * 
 * 
 * Whenever we create an object using the operator new, it will create a new
 * memory location for that object. So we use the == operator to check memory
 * location or address of two objects are the same or not.
 */