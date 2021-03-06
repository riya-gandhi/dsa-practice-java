import java.io.*;
import java.util.*;

public class graph_has_path {
    static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

   public static boolean hasPath(ArrayList<Edge>[] graph, boolean[] visited, int src, int dest){
       
       if(src==dest){
           return true;
       }
       //mark node visited else there ll be a loop between same edges
       //as 10 is a edge and 01 is also a edge, if 1 is visited once, no need to call again
       
       visited[src] = true;
       
       for(int i=0;i<graph[src].size();i++){
           
           Edge e = graph[src].get(i);
           if(visited[e.nbr]==false){   //I MADE MISTAKE HERE, do a dry run here
               
               boolean pathFound = hasPath(graph, visited, e.nbr, dest);
               if(pathFound == true){
                   return true;
               }
           }
           
           
       }
       
       return false;
   }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int vtces = Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for (int i = 0; i < vtces; i++) {
            graph[i] = new ArrayList<>();
        }

        int edges = Integer.parseInt(br.readLine());
        for (int i = 0; i < edges; i++) {
            String[] parts = br.readLine().split(" ");
            int v1 = Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            graph[v1].add(new Edge(v1, v2, wt));
            graph[v2].add(new Edge(v2, v1, wt));
        }

        int src = Integer.parseInt(br.readLine());
        int dest = Integer.parseInt(br.readLine());

        // write your code here

        boolean[] visited = new boolean[vtces];

        // for (boolean i : visited) {
        //     i = false;
        // }

        boolean ifPathFound = hasPath(graph, visited, src, dest);
        System.out.println(ifPathFound);
    }

}