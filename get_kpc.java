// import java.io.*;
import java.util.*;

public class get_kpc {    //get_kpc mai sare codes arraylist mei store hoke return honge

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    scn.close();

    ArrayList<String> list = getKPC(str);
    System.out.println(list);
  }
    
  static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

  public static ArrayList<String> getKPC(String str) {
      
    if (str.length() == 0) {
      ArrayList<String> base_list = new ArrayList<>();
      base_list.add("");
      return base_list;
    }

    ArrayList<String> list_caught = getKPC(str.substring(1));
    String str_required = codes[Integer.parseInt(str.substring(0, 1))];

    String[] temp = str_required.split("");
    
    ArrayList<String> ans_list = new ArrayList<>();

    for (String i : temp) {
      for (String j : list_caught) {
        ans_list.add(i + j);
      }
    }
    
    return ans_list;
  }

}