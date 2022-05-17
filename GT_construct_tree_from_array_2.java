import java.io.*;
import java.util.*;

public class GT_construct_tree_from_array_2 {
    private static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }

    public static void display(Node node) {
        System.out.println(node.data);
    }

    public static Node construct(int[] arr) {
        
        //psuedocode
        //take a stack
        //if stack empty, the node is root
        //
        //if(arr[i]==-1) pop and add tos.children.add(pop)
        //else create a node, push it in stack

        Stack<Node> stack = new Stack<>();
        Node root = null;
        Node node = new Node();

        for(int i:arr){

            if(i!=-1){
                node.data = i;
                stack.push(node);
            }
            else{
                Node pop = stack.pop();
                
                if(stack.size()>0){
                    stack.peek().children.add(pop);
                }
                else{
                    root = node;
                }
            }
        }
        return root;
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
        display(root);
    }

}