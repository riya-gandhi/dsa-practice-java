import java.util.*;

public class get_stair_practice {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        ArrayList<String> ans = gsp(n);
        System.out.println(ans);
    }

    static ArrayList<String> gsp(int n) {
        if (n <= 0) {
            ArrayList<String> base = new ArrayList<>();
            if (n == 0) {
                base.add("");
            }
            return base;
        }
        ArrayList<String> list1 = gsp(n - 1);
        ArrayList<String> list2 = gsp(n - 2);
        ArrayList<String> list3 = gsp(n - 3);

        ArrayList<String> ansList = new ArrayList<>();

        for (String s : list1) {
            ansList.add("1" + s);
        }
        for (String s : list2) {
            ansList.add("2" + s);
        }
        for (String s : list3) {
            ansList.add("3" + s);
        }

        return ansList;

    }
}
// things i learnt here
// to make a path invalid : just dont add "" in base case. the lower loops wont run3 simple
