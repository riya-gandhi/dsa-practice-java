import java.io.*;
// import java.util.*;

public class LL_remove_first {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        public void removeFirst() {
            // write your code here - procedure
            // if size 0 print list is empty return-1
            //if size 1 head and tail become null after
            //else traverse to second node and change head to second node
            //size--;
            if (this.size == 0) {
                System.out.println("List is empty");
                return;
            } else if (size == 1) {
                head = tail = null;
                this.size--;
            } else {
                Node temp = head.next;
                head = temp;
                this.size--;
            }
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
            } else if (str.startsWith("size")) {
                System.out.println(list.size());
            } else if (str.startsWith("display")) {
                list.display();
            } else if (str.startsWith("removeFirst")) {
                list.removeFirst();
            }
            str = br.readLine();
        }
    }
}