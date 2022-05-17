import java.util.*;

public class stringCompress {

	public static String compression1(String str){
		// write your code here
		
		String temp = "";

		for(int i=0;i<str.length()-1;i++){		//second last element tak loop warna out of bounds exception aarha hai
			if(str.charAt(i)!=str.charAt(i+1)){
				temp += str.charAt(i);
			}
		}
		temp += str.charAt(str.length()-1);
		return temp;
	}

	public static String compression2(String str){
		// write your code here

		String temp = ""; int count = 0;

		for(int i=0;i<str.length()-1;i++){
			
			if((str.charAt(i)!=str.charAt(i+1)&&(count!=0))){
				temp += str.charAt(i);
				temp += count+1;
				count = 0;
			}
			else{
				count++;
			}
		}
		temp += str.charAt(str.length()-1);
		temp += count+1;

		return temp;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		scn.close();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}