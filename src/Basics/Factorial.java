package Basics;
import java.util.*;

public class Factorial {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(factorial(number));
        System.out.println(iterative(number));
    }

    static int factorial(int n) {
        if (n!=0) {
            return n * factorial(n-1);
        }
        return 1;
    }
    static int iterative(int n) {
        int output = 1;
        while (n>0) {
            output *= n;
            n --;
        }
        return output;
    }
}
