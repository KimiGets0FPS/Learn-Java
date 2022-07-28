package Basics;

public class Loops {
    public static void main(String[] args) {
        // For loop
        int end = 10;
        System.out.println("This is a for loop!");
        for (int i = 1; i <= end; ++i) {
            System.out.println(i);
        }

        // While loop
        System.out.println("This is a while loop!");
        int i = 0;
        while (i <= end) {
            System.out.println(i);
            i++;
        }

        // Using Break
        i = 0;
        while (true) {
            if (i == 5){
                System.out.println("'i' is now 5!");
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
