import java.util.Scanner;
import java.util.Random;

public class PigGame {

    public static void main (String [] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        String rollAgain = "";

        System.out.println("Welcome! Lets Play Roll Dice!");

        do {
            // rolls two random numbers from 1-6
            int randRollA = 1 + rand.nextInt(6);
            int randRollB = 1 + rand.nextInt(6);
            System.out.println("Your rolls " + randRollA + " & " + randRollB);
            // score is incremented by 25 if both rolls are 1
            // score is incremented by 0 if either roll is a 1
            // otherwise add the sum of both rolls to the score
            if (randRollA == 1 && randRollB == 1) {
                score += 25;
            } else if (randRollA == 1 || randRollB == 1) {
                score += 0;
            } else {
                score += (randRollA + randRollB);
            }
            System.out.println("Score: " + score);
            if (score >= 100) {
                System.out.println("You have scored over 100!");
                break;
            }
            System.out.print("Roll again? ");
            rollAgain = in.nextLine();
            System.out.println();
        } while (rollAgain.equalsIgnoreCase("yes"));

        System.out.println("Thank you for playing!");
    }

}
