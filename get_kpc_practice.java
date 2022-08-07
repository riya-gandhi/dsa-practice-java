// import java.io.*;
import java.util.*;

public class get_kpc_practice {

    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<>();
        map.put("0",".;" );
        map.put("1","abc"); 
        map.put("2","def"); 
        map.put("3","ghi"); 
        map.put("4","jkl"); 
        map.put("5","mno"); 
        map.put("6","pqrs"); 
        map.put("7","tu"); 
        map.put("8","vwx"); 
        map.put("9","yz");
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        ArrayList<String> ansList = getKPC(str,map);
        scn.close();
        System.out.println(ansList);
    }

    public static ArrayList<String> getKPC(String str, HashMap<String,String> map) {

        if(str.length()==0){
            ArrayList<String> baseList = new ArrayList<>();
            baseList.add("");
            return baseList;
        }
        
        ArrayList<String> rarr = getKPC(str.substring(1), map);
        ArrayList<String> ansarr = new ArrayList<>();
        
        for(char c : map.get(str.substring(0, 1)).toCharArray()){
            for(String s: rarr){
                ansarr.add(c+s);
            }
        }
        return ansarr;
    }

}