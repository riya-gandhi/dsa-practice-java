// import java.io.*;
import java.util.*;

public class stack_brackets {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();

        boolean flag = solve(str);
        System.out.println(flag);

        //our algorithm is to check if there's a single char between
        //my initial mistake was not initialising duplicatePair flag when we encounter ')'

    }

    public static boolean solve(String str){
        boolean duplicatePair = true;
        Stack<Character> stack = new Stack<>();

        for(char c: str.toCharArray()){
            stack.push(c);
            if(stack.peek()==')'){
                duplicatePair = true;
                while(stack.peek()!='('){
                    stack.pop();
                    if(stack.peek()!='('){
                        duplicatePair = false;
                    }
                }
                stack.pop();
                if(duplicatePair==true){
                    return duplicatePair;
                }
            }
        }

        return duplicatePair;
    }

}