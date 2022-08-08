// import java.io.*;
import java.util.*;

public class get_maze_path_with_jumps_practice {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.close();
        ArrayList<String> ans = getMazePaths(1,1,n,m);
        System.out.println(ans);
        

    }

    // imp point
    // 1. for v and h jumps: base case can take care of breaking wall
    // 2. for d jumps: tricky to take care of breaking matrix wall
    

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr>dr||sc>dc){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        if(sr==dr&&sc==dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> ansList = new ArrayList<>();
        
        for(int h=1;h<dc;h++){
            ArrayList<String> listh = getMazePaths(sr,sc+h,dr,dc);
            for(String s : listh){
                ansList.add("h"+h+s);
            }   
        }
        for(int v=1;v<dr;v++){
            ArrayList<String> listv = getMazePaths(sr+v,sc,dr,dc);
            for(String s : listv){
                ansList.add("v"+v+s);
            }   
        }
        for(int d=1;d<=dc-sc&&d<=dr-sr;d++){
            ArrayList<String> listd = getMazePaths(sr+d,sc+d,dr,dc);
            for(String s : listd){
                ansList.add("d"+d+s);
            }   
        }
        return ansList;
    }

}