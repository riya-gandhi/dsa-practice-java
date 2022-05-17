import java.io.*;
import java.util.*;

public class GT_leveloder_linewise {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
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

  public static int size(Node node) {
    int s = 0;

    for (Node child : node.children) {
      s += size(child);
    }
    s += 1;

    return s;
  }

  public static int max(Node node) {
    int m = Integer.MIN_VALUE;

    for (Node child : node.children) {
      int cm = max(child);
      m = Math.max(m, cm);
    }
    m = Math.max(m, node.data);

    return m;
  }

  public static int height(Node node) {
    int h = -1;

    for (Node child : node.children) {
      int ch = height(child);
      h = Math.max(h, ch);
    }
    h += 1;

    return h;
  }

  public static void traversals(Node node){
    System.out.println("Node Pre " + node.data);

    for(Node child: node.children){
      System.out.println("Edge Pre " + node.data + "--" + child.data);
      traversals(child);
      System.out.println("Edge Post " + node.data + "--" + child.data);
    }

    System.out.println("Node Post " + node.data);
  }

  public static void levelOrderLinewise(Node node){
    // write your code here

    //approach is to alternate between 2 queues

    // Queue<Node> q1 = new ArrayDeque<>();
    // Queue<Node> q2 = new ArrayDeque<>();

    // q1.add(node);

    // while(q1.size()>0||q2.size()>0){
    //     while(q1.size()>0){

    //         Node temp = q1.remove();
    //         System.out.print(temp.data+" ");
    //         for(Node child:temp.children){
    //             q2.add(child);
    //         }

    //     }
    //     System.out.println();
    //     while(q2.size()>0){

    //         Node temp = q2.remove();
    //         System.out.print(temp.data+" ");
    //         for(Node child:temp.children){
    //             q1.add(child);
    //         }

    //     }
    //     System.out.println();
        
    // }

    Queue<Node> q1 = new ArrayDeque<>();
    q1.add(node);
    Queue<Node> q2 = new ArrayDeque<>();

    while(q1.size()>0){

        Node temp = q1.remove();
        System.out.print(temp.data+" ");

        for(Node child:temp.children){
            q2.add(child);
        }

        if(q1.size()==0){
            q1 = q2;
            q2 = new ArrayDeque<>();
            System.out.println();
        }

    }

  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    levelOrderLinewise(root);
  }

}