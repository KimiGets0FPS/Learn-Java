import java.util.Scanner;


public class Java_Input {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: \n Enter another number: ");
        int number = input.nextInt(), number_2 = input.nextInt();
        int answer = number + number_2;
        System.out.println("Your sum of 2 numbers: "+ answer);
        input.close();
    }
}
