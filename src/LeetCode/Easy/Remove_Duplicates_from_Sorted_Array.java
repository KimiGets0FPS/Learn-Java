package LeetCode.Easy;

public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String args[]) {

        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // Input array
        int[] expectedNums = new int[]{0, 1, 2, 3, 4}; // The expected answer with correct length

        int k = Solution(nums); // Calls your implementation

        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }

    public static int Solution(int[] nums) {
        int count = 1;
        int current = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (current != nums[i]) {
                count ++;
                current = nums[i];
            }
        }
        return count;
    }
}
