// import java.io.*;
import java.util.*;

public class hashmap_frequency_array {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char c: str.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,0);
            }
        }
        // hashmap is filled, now we need to get max frequency key
        
        int max = 0;
        char ans = 'a';
        for(char c2 : map.keySet()){
            if(max<map.get(c2)){
                max = map.get(c2);
                ans = c2;
            }
        }
        System.out.println(ans);
    }

}