import java.util.Random;
import java.util.Scanner;
public class numberGame {

    public static void main(String[] args) {
        int userGuess;
        double point = 0;
        int number_of_rounds;
        Random rm = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNumber = rm.nextInt(100);
        System.out.println("System: how many rounds you wanna play?");
        number_of_rounds = sc.nextInt();
        System.out.println(" System :  you will have " + number_of_rounds
                + " rounds\n your points will add up at the end of each round\n and will be display at end \n +1 for correct guess \n -0.5 for wrong guess ");

        System.out.println("System : I am selecting a random(natural) number between 0 and 100.");
        for (int i = 0; i <= number_of_rounds; i++) {
            System.out.println("System : Try to guess the number.");
            userGuess = sc.nextInt();
            if (userGuess > 100 || userGuess < 0) {
                System.out.println("System : Invalid input.");

            } else if (userGuess == randomNumber) {
                System.out.println("System : You guessed it right.");
                point++;
            } else if (userGuess > randomNumber) {
                System.out.println("System : You guess is higher than the number.");
                System.out.println("System : try again");
                point -= 0.5;

            } else if (userGuess < randomNumber) {
                System.out.println("System : You guess is lower than the number.");
                System.err.println("System : try again");
                point -= 0.5;

            }
            System.out.println(" your point for this round is " + point);
        }
        System.out.println(" total number of round " + number_of_rounds);
        System.out.println(" your total points are " + point);
    }
}
