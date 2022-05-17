// import java.io.*;

import java.util.*;

public class GT_max_cost_rough {
  private static class Node {
    int data;
    ArrayList< Node> children = new ArrayList< >();
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack< Node> st = new Stack< >();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  public static int maxCost(Node node){

    int cost = 0;
    for(Node child:node.children){
        
        cost += maxCost(child);
    }

    if(node.data>0){
        return cost+1;
    }
    else return 0;

  }

  public static void main(String[] args) throws Exception {
    
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] p_arr = new int[n];
    int [] val_arr = new int[n];

    for(int i=0;i<n;i++){
        p_arr[i] = scn.nextInt();
    }
    for(int i=0;i<n;i++){
        val_arr[i] = scn.nextInt();
    }
    scn.close();

    Node root = construct(val_arr);
    int ans = maxCost(root);
    System.out.println(ans);
  }
}