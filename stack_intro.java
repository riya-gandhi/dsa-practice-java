// import java.io.*;
import java.util.*;

public class stack_intro {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        int sumofstack = 0;
        sumofstack += stack.pop();
        sumofstack += stack.pop();
        sumofstack += stack.pop();
        sumofstack += stack.pop();
        sumofstack += stack.pop();

        System.out.println(sumofstack);

    }
}
