public class rough{

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static Node createLLFromArray(int[] arr){

        if(arr.length<=0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i = 1; i < arr.length; i++){
            Node node = new Node(arr[i]);
            prev.next = node;
            prev = node;
        }

        prev.next = null;
        return head;

    }

    static Node reverseLL(Node head){

        while(head != null){
            Node temp = new Node(head.data);
        }
    }

    public static void main(String[] args){
        
        int[] arr = {1,2,3,4};
        Node head = createLLFromArray(arr);

        Node newHead = reverseLL(head);

        while(newHead != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}