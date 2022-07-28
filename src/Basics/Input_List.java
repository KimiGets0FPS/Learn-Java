package Basics;
import java.util.*;
import java.util.Arrays;

public class Input_List {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nums = input.nextLine().split(" ");
        System.out.println(Arrays.toString(nums));

        int[] numbers = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            numbers[i] = Integer.parseInt(nums[i]);
        }
        System.out.println(Arrays.toString(numbers));
    }
}
