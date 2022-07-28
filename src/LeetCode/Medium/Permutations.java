package LeetCode.Medium;

import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        permutate(nums, output, new boolean[nums.length], new ArrayList<>());
        return output;
    }

    static void permutate(int[] nums, List<List<Integer>> output, boolean[] ifused, List<Integer> current) {
        if (nums.length == current.size()) {
            output.add(new ArrayList<>(current));
        }
        else {
            for (int i=0; i < nums.length; i++) {
                if (!ifused[i]) {
                    ifused[i] = true;
                    current.add(nums[i]);
                    permutate(nums, output, ifused, current);
                    current.remove(current.size()-1);
                    ifused[i] = false;
                }
            }
        }
    }
}
