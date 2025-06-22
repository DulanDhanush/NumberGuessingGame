import java.util.Random;
import java.util.Scanner;

public class NumberGussingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // variables

        int min = 1;
        int max = 100;
        String playAgain;

        // welcome message
        do {
            int guss;
            int attempts = 0;
            int randomNumber = random.nextInt(min, max + 1);
            System.out.println("\nWelcome To The Number Guessing Game!\n");
            System.out.printf("Enter Number Between %d to %d\n", min, max);
            // guess loop
            do {
                System.out.print("Guess: ");
                guss = scanner.nextInt();
                attempts++;

                if (guss > randomNumber) {
                    System.out.println("TOO HIGH!!");
                } else if (guss < randomNumber) {
                    System.out.println("TOO LOW!!");
                } else {
                    System.out.println("CORRECT!!");
                }
            } while (guss != randomNumber);

            System.out.println("Correct Number Was: " + randomNumber);
            System.out.println("Number of attempts:" + attempts);
            scanner.nextLine();// To clear empty line
            // used a bumper
            System.out.print("Do You Want To Play Again(Yes/No): ");
            playAgain = scanner.nextLine().toUpperCase();
        } while (playAgain.equals("YES"));

        System.out.println("Thank You!");

        scanner.close();
    }
}
