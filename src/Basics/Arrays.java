package Basics;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args) {
        // Array (but can't be changed why would you use this)
        int[] numbers = new int[5];
        numbers[2] = 69;
        System.out.println(numbers);
        // ArrayList (Could be changed)
        List<Integer> nums = new ArrayList<>(); // Array of Integers
        nums.add(69);
        System.out.println(nums);
        List<String> words = new ArrayList<>();
        words.add("hi my name is Kimi");
        System.out.println(words);
    }
}
