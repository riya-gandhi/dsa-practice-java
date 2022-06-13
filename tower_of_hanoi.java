import java.util.*;

public class tower_of_hanoi{
    
    public static void towerOfHanoi(int n, int a, int b, int c){
        
        if(n==0){
            // System.out.println(1+"["+ a + " -> " +b+"]");
            // System.out.println(2+"["+ a + " -> " +b+"]");
            // System.out.println(1+"["+ a + " -> " +b+"]");
            return;
        }
        //pre area - nothing
        towerOfHanoi(n-1,a,c,b);
        //inn area
        
        System.out.println(n+"["+ a + " -> " + b +"]");
        
        towerOfHanoi(n-1,c,b,a);
        //post area - nothing
    }
    
    public static void main(String[] args){
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        scn.close();;
        towerOfHanoi(n,a,b,c);
    }
}