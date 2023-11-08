import java.util.Comparator;
import java.util.PriorityQueue;

public class Comparable_comparator_interface {
    static class Student implements Comparable<Student>{
        String name;
        int height;
        int weight;
        int marks;

        Student(String name, int height, int weight, int marks){
            this.name = name;
            this.height = height;
            this.weight = weight;
            this.marks = marks;
        }

        public String toString(){
            return this.name+" h= "+this.height+" w= "+this.weight+" m= "+this.marks;
        }

        public int compareTo(Student other){
            return this.height - other.height;
        }
    }

    static class StudentWeightComparator implements Comparator<Student>{

        public int compare(Student s1, Student s2){
            return s1.weight - s2.weight;
        }

    }
    static class StudentMarksComparator implements Comparator<Student>{

        public int compare(Student s1, Student s2){
            return s1.marks - s2.marks;
        }

    }

    public static void main(String[] args){

        // Student s1 = new Student("A",100,50,99);
        // Student s2 = new Student("A",100,50,99);
        // Student s3 = new Student("A",100,50,99);
        // Student s4 = new Student("A",100,50,99);
        // Student s5 = new Student("A",100,50,99);
        // Student s6 = new Student("A",100,50,99);

        // PriorityQueue<Student> pqheight = new PriorityQueue<>();
        // PriorityQueue<Student> pqWeight = new PriorityQueue<>();
        // PriorityQueue<Student> pqMarks = new PriorityQueue<>();

        


        

    }
    
}
