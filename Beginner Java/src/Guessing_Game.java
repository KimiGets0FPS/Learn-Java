import java.util.Scanner;
import java.util.Random;


public class Guessing_Game {
    public static void main(String[] args) {
        boolean flag = true;
        while(flag) {
            boolean win = false;  // currently false since if the player wins, then it'll update to true
            Scanner times = new Scanner(System.in);
            System.out.print("Enter the number of times you want to guess: ");
            int num_times = times.nextInt();  // the user's option for the number of times he/she wants to go
            Random number = new Random();  // the random number
            int random_num = number.nextInt(50);

            while(num_times > 0) {
                Scanner guess = new Scanner(System.in);
                System.out.print("Your Guess: ");
                int num_guess = guess.nextInt();

                if (num_guess > random_num) { System.out.println("Guess lower!"); }
                if (num_guess < random_num) { System.out.println("Guess higher!"); }
                num_times--;
                if (num_guess == random_num) {
                    System.out.println("You win!");
                    win = true;
                }
                if (num_times == 0) {
                    System.out.println("You lose!");
                }
                if (num_times == 0 || win) {
                    break;
                }
            }
            System.out.println("\nThe number was: " + random_num);
            Scanner go_again = new Scanner(System.in);
            System.out.print("Go again? Type 'true' if you want to go again, or 'false' if you don't: ");
            boolean decision = go_again.nextBoolean();
            if (!decision) { System.out.println("Thanks for playing!"); }
            if(!decision) { flag=false; }
        }
    }
}
