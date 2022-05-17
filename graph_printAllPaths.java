import java.io.*;
import java.util.*;

public class graph_printAllPaths {
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

    public static void printAllPaths(ArrayList<Edge>[] graph, boolean[] visited, int src, int dest, String pathSofar) {

        if (src == dest) {
            System.out.println(pathSofar + src);
            return;
        }
        visited[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {

            Edge e = graph[src].get(i);
            if (visited[e.nbr] == false) {

                printAllPaths(graph, visited, e.nbr, dest, pathSofar + src);
            }
        }
        visited[src] = false;
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

        // write all your codes here

        // algorithm to be followed here: store the path in the string in parameter
        // in pre-order mark visited true, in post order mark it false

        boolean[] visited = new boolean[vtces];
        printAllPaths(graph, visited, src, dest, "");
    }

}