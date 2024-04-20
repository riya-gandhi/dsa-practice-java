// can be solved in O(n) also -> one loop only


public class valid_anagram {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();
        scn.close();

        boolean flag = solve(s1, s2);

        System.out.println(flag);
    }

    public static boolean isAnagram(String s, String t) {

        char[] sarr = s.toCharArray();
        Arrays.sort(sarr);
        String sStr = new String(sarr);

        char[] tarr = t.toCharArray();
        Arrays.sort(tarr);
        String tStr = new String(tarr);

        if(sStr.equals(tStr)){
            return true;
        }
        else return false;
        
    }
} 