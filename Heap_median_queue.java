import java.io.*;
import java.util.*;

public class Heap_median_queue {

    public static class MedianPriorityQueue {
        PriorityQueue<Integer> left;
        PriorityQueue<Integer> right;

        public MedianPriorityQueue() {
            left = new PriorityQueue<>(Collections.reverseOrder());
            right = new PriorityQueue<>();
        }

        public void add(int val) {
            // write your code here

            //default add in left
            //if element greater than left.peek, add in right

            // if(val<left.peek()){
            //     left.add(val);
            // }
            // else if(val>right.peek()){
            //     right.add(val);
            // }
            // else{
            //     left.add(val);
            //     if(Math.abs(left.size()-right.size())>1){
            //         right.add(left.remove());
            //     }
            // }

            if(right.size()>0&&val>right.peek()){
                right.add(val);
            }
            else{
                left.add(val);
            }
            handleGap();
        }
        private void handleGap(){
            if(left.size()-right.size()>1){
                right.add(left.remove());
            }
            else if(right.size()-left.size()>1){
                left.add(right.remove());
            }
        }

        public int remove() {
            // write your code here
            //if size odd, remove from larger pq
            //else remove from left
            //didnt handle underflow condition
            if(this.size()==0){
                System.out.println("Underflow");
                return -1;
            }

            int totalSize = left.size()+right.size();
            if(totalSize%2==0){
                return left.remove();
            }
            else{
                if(left.size()>right.size()){
                    return left.remove();
                } else return right.remove();
            }
        }

        public int peek() {
            // write your code here
             if(this.size()==0){  
                 System.out.println("Underflow");
                return -1;
            }
            int totalSize = left.size()+right.size();
            if(totalSize%2==0){
                return left.peek();
            }
            else{
                if(left.size()>right.size()){
                    return left.peek();
                } else return right.peek();
            }

        }

        public int size() {
            // write your code here
            return left.size() + right.size();
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MedianPriorityQueue qu = new MedianPriorityQueue();

        String str = br.readLine();
        while (str.equals("quit") == false) {
            if (str.startsWith("add")) {
                int val = Integer.parseInt(str.split(" ")[1]);
                qu.add(val);
            } else if (str.startsWith("remove")) {
                int val = qu.remove();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("peek")) {
                int val = qu.peek();
                if (val != -1) {
                    System.out.println(val);
                }
            } else if (str.startsWith("size")) {
                System.out.println(qu.size());
            }
            str = br.readLine();
        }
    }
}