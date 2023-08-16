package leetcode.daily_practice;

import java.util.*;

class students_sandwiches {

    public static void main(String[] args){
        int[] students = {1,1,0,0};
        int[] sandwiches = {1,1,0,0};
        int ans = countStudents(students, sandwiches);
    }

    public static int countStudents(int[] students, int[] sandwiches) {

        int[] eaten = new int[students.length];
        Arrays.sort(students);

        for(int i=0; i<sandwiches.length; i++){

            int flag = Arrays.binarySearch(students,sandwiches[i]);
            if(flag>0){
                eaten[i] = 1;
            }
            
        }

        System.out.print(eaten);
        return 3;
        
    }
}