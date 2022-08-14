// import java.io.*;
import java.util.*;

public class print_permutations_practice {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        printPermutations(str,"");
        scn.close();
    }

    public static void printPermutations(String str, String asf) {
        
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        
        for(int i=0;i<str.length();i++){
            
            String temp = "";
            
            for(int j=0;j<str.length();j++){
                if(j==i){
                    continue;
                }
                else temp += str.charAt(j);
            }
            
            printPermutations(temp,asf+str.charAt(i));
        }
    }

}