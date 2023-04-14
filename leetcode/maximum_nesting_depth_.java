package leetcode;
public class maximum_nesting_depth_ {

    public static void main(String[] args){
        String s = "(1)+((2))+(((3)))";
        int ans = maxDepth(s);
        System.out.println(ans);
    }


    public static int maxDepth(String s) {
        int depth = 0;
        int left = 0;// counting left parantheses
        int right = 0;// counting right paranthese
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                left++;
                if (left - right > depth) {
                    depth = left - right;
                }
            } else if (s.charAt(i) == ')') {
                right++;
            }
        }
        return depth;

    }
}
