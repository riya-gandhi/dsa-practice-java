import java.io.*;
import java.util.*;

public class GT_size_2 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        //go to a node
        // print node ->
        //print node.children separated by ", "
        //print "." for all even leaves

        System.out.print(node.data+" -> ");
        for(Node child: node.children){

            System.out.print(child+", ");

        }
        System.out.print(".");

        for(Node child: node.children){
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
        // write your code here

        //pseudocode
        //ask each child to return their size +1
        int size = 0;

        for(Node child: node.children){
            size += size(child);
        }
        return size+1;
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
        int sz = size(root);
        System.out.println(sz);
        // display(root);
    }

}