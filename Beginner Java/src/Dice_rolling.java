import java.util.Objects;
import java.util.Scanner;
import java.util.Random;


public class Dice_rolling {
    public static void main(String[] args) {
        while (true) {
            Scanner times = new Scanner(System.in);
            System.out.print("How many dice rolls do you want: ");
            int num = times.nextInt();
            times.close();
            for (int i = 1; i < num + 1; i++) {
                Random random = new Random();
                System.out.println(i + ".) " + random.nextInt(6));
            }
            Scanner again = new Scanner(System.in);
            System.out.print("Roll Again (Yes or No): ");
            String no = again.nextLine();
            if (Objects.equals(no, "no")) {
                return;
            }
        }
    }
}
