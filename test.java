public class test {

    public static void main(String[] args) {
       
        int min = -2;
        int max = 6;
       int i =0;
       while(i<100){
           int score = (int) (Math.random() * (max - min + 1) + min);
           System.out.println(score);
           i++;
       }
    }
}