
// import java.io.*;
import java.util.*;

public class GT_construct_tree_from_array {

    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        // also writing constructor

        // Node(int data) {
        // this.data = data;
        // }

    }

    public static void levelorder(Node root) {

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while (q.size() > 0) {
            Node temp = q.remove();

            for (Node i : temp.children) { // note temp.children, temp always will have toq
                q.add(i);
            }

            System.out.print(temp.data + " ");

        }

    }

    public static void levelOrder(Node root) {
        Queue<Node> queue = new ArrayDeque<Node>();
        queue.add(root);

        while (queue.size() > 0) {
            // r,p,a
            Node temp = queue.remove();
            System.out.print(temp.data + " ");
            for (Node child : temp.children) {
                queue.add(child);
            }
        }

        System.out.println(".");
    }

    public static Node construct_tree_from_array(int[] arr) {

        Stack<Node> s = new Stack<>();
        Node root = null; // I'd have used new operator to create a new node

        // if arr[i] == -1
        // pop stack
        // make popped the child of tos
        // GOT EMPTY STACK EXCEPTION

        for (int i : arr) {

            if (i != -1) {
                Node temp = new Node();
                temp.data = i;
                s.push(temp);
            } else {
                Node node = s.pop();
                if (s.size() > 0) {

                    s.peek().children.add(node);
                } else {
                    root = node;

                }
            }

        }
        return root;
    }

    public static void main(String[] args) {

        int[] arr = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1,
                -1 };
        Node root = new Node();

        root = construct_tree_from_array(arr);

        levelorder(root);

    }

}
