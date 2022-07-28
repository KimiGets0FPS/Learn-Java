package Basics;

import java.util.Scanner;


public class Sum_of_number {
    public static void main(String[] args) {
        double number, sum = 0;
        for (int i=0; i <= 2; ++i) {
            System.out.println("Your number: ");
            Scanner input = new Scanner(System.in);
            number = input.nextDouble();
            if (number <= 0.0) {
                continue;
            }
            input.close();
            sum += number;
        }
        System.out.println(sum);
    }
}
