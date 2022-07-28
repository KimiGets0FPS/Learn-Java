package Basics;

import java.util.*;
import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 5; i > 0 ; i--) {
            nums.add(i);
        }
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
        nums.clear();
        List<int[]> new_nums = new ArrayList<>();
        new_nums.add(new int[]{2, 1});
        new_nums.add(new int[]{1, 2});
        new_nums.sort(Comparator.comparingInt(o->o[0]));
        System.out.println(Arrays.toString(new_nums.get(0)));
        System.out.println(Arrays.toString(new_nums.get(1)));
    }
}
