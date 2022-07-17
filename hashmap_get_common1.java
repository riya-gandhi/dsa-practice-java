// import java.io.*;
import java.util.*;

public class hashmap_get_common1 {

    public static void main(String[] args) throws Exception {
        // write your code here
        // below solution did not print values in order
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < n1; i++) {
            map1.put(scn.nextInt(), 0);
        }
        for (int i = 0; i < n2; i++) {
            map2.put(scn.nextInt(), 0);
        }

        scn.close();

        for (int i : map2.keySet()) {

            if (map1.containsKey(i)) {
                System.out.println(i);
            }
        }

    }

}