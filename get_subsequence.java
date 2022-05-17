// import java.io.*;
import java.util.*;

public class get_subsequence {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();

        ArrayList<String> list = new ArrayList<>();
        list = gss(str);
        System.out.print(list);

    }

    public static ArrayList<String> gss(String str) {
        
        if (str.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add("");
            return list;
        }
        
        ArrayList<String> list1 = gss(str.substring(1));
        
        ArrayList<String> list2 = new ArrayList<>();

        for (String i : list1) {
            list2.add("" + i); //for each string i in list1, add "" to i
            // list2.add(str.substring(0, 1) + i);
        }
        for (String i : list1) {
            // list2.add("" + i);      //for each string i in list1, add "" to i
            list2.add(str.substring(0, 1) + i);
        }
        return list2;

    }

}