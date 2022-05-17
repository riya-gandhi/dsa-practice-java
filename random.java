// import java.io.*;

public class random {

    public static void main(String[] args) {

        int min = -2;
        int max = 6; // for range, max is exclusive
        int maxovers = 20;
        int wicketsLeft = 10;
        int currentScore = 0;

        for (int i = 1; i <= maxovers; i++) {

            int currentBall = 1;
            while (currentBall <= 6 && wicketsLeft > 0) {

                int score = (int) (Math.random() * (max - min + 1) + min);
                // System.out.println(score);
                if (score == -1) {

                    wicketsLeft--;
                    System.out.println("Over : "+i+" Ball : "+currentBall);
                }
                else{
                    currentScore += score;
                }

                currentBall++;


            }
        }
        System.out.println("Score after this inning: "+ currentScore);
    }
}
