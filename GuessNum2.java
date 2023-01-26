import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class GuessNum2 {
    public static void main(String[] args) {
        int ans, guess;
        final int MAX = 100;
        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        boolean correct = false;
        ans = rand.nextInt(MAX) + 1;
        while (!correct) {
            System.out.println("Guess a number between 1 and 100:");
            guess = reader.nextInt();
            if (guess > ans) {
                System.out.println("Given number is large, try again now.");
            } else if (guess < ans) {
                System.out.println("Given number is small, try again now.");
            } else {
                System.out.println("Given number is correct..");
                correct = true;
            }
        }
        reader.close();
    }
}