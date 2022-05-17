import java.util.*;
// import java.io.*;

public class queue_intro{
    public static void main(String[] args) {
        
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(10);
        queue.add(10);
        queue.add(10);
        queue.add(10);

        int sum = 0;
        //queue.peek will return top element
        //queue.size will return current size

        sum += queue.remove();
        sum += queue.remove();
        sum += queue.remove();
        sum += queue.remove();
        sum += queue.remove();

        System.out.println(sum);


    }
}