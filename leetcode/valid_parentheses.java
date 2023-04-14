package leetcode;

import java.util.HashMap;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.size() > 0 && map.get(c) == stack.peek()) {
                    stack.pop();
                } else
                    return false;
            }
        }
        if (stack.size() > 0) {
            return false;
        } else
            return true;
    }
}