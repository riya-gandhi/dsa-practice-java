// import java.io.*;
import java.util.*;

public class GT_levelorder {

    public static class Node {
        int data;
        ArrayList<Node> children = new ArrayList<>();

        //also writing constructor

        Node(int data) {
            this.data = data;
        }

    }

    public static void levelorder(Node root) {

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        while (q.size() > 0) {
            Node temp = q.remove();

            for (Node i : temp.children) { //note temp.children, temp always will have toq
                q.add(i);
            }

            System.out.print(temp.data + " ");

        }

    }
    
    public static void levelorderLine(Node root) {
        
        Queue<Node> q = new ArrayDeque<>();
        Queue<Node> childq = new ArrayDeque<>();

        q.add(root);

        while (q.size() > 0) {
            Node temp = q.remove();
            for (Node i : temp.children) {
                childq.add(i);
            }
            
        }
    }
    
    public static void main(String[] args) {

        Node root = new Node(10);
        Node child1 = new Node(20);
        root.children.add(child1);

        Node child2 = new Node(30);
        root.children.add(child2);

        Node child3 = new Node(40);
        root.children.add(child3);

        Node child11 = new Node(50);
        child1.children.add(child11);

        Node child12 = new Node(60);
        child1.children.add(child12);

        Node child21 = new Node(70);
        child2.children.add(child21);

        Node child31 = new Node(80);
        child3.children.add(child31);

        levelorder(root);

    }


}
