import java.io.*;
// import java.util.*;

public class LL_add_last {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            // Write your code here
            // create a node, update its data member to val, point its next member to null
            // update last node next mem to point to the new node
            //update tail to new node, size++

            Node new_node = new Node();
            new_node.data = val;
            new_node.next = null;

            if (this.size == 0) {
                head = tail = new_node;
            } else {

                tail.next = new_node;
                tail = new_node;
            }
            this.size++;
        }
    }

    public static void testList(LinkedList list) {
        for (Node temp = list.head; temp != null; temp = temp.next) {
            System.out.println(temp.data);
        }
        System.out.println(list.size);


        if (list.size > 0) {
            System.out.println(list.tail.data);
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList list = new LinkedList();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("addLast")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                list.addLast(val);
            }
            str = br.readLine();
        }

        testList(list);
    }
}