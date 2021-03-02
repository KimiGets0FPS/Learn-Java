import java.util.Scanner;
import java.util.Random;


public class Dice_rolling {
    public static void main(String[] args) {
        Scanner times = new Scanner(System.in);
        System.out.print("Number of times you want this program to run: ");
        int num = times.nextInt();
        times.close();
        for(int i=1; i < num+1; i++) {
            Random random = new Random();
            System.out.println(i+".) "+random.nextInt(6));
        }
    }
}
