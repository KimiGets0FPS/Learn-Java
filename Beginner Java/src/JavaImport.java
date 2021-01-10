import java.util.Scanner;


public class JavaImport {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.print("Enter another number: ");
        int number2 = input.nextInt();
        int answer = number + number2;
        System.out.println("You inputed: "+ answer);
        input.close();
    }
}
