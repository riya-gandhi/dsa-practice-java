// import java.io.*;
import java.util.*;

public class stack_balance_brackets {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        scn.close();
        Stack<Character> st = new Stack<>();

        for(char c: str.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                st.push(c);
            }
            else if(c==')'||c=='}'||c==']'){
                switch (c) {
                    case ')':
                        st.peek();
                        
                        break;
                }
            }
        }

    }

}