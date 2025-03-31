import java.io.*;
import java.util.*;

public class Problem_2 {
    public static void main(String[] args) throws IOException {
        Kattio io = new Kattio(System.in, System.out);

        int T = io.nextInt();

        for (int i = 0; i < T; i++) {
            int n = io.nextInt();
            int k = io.nextInt();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = io.nextInt();
            }
            List<int[]> rules = new ArrayList<>();
            for (int j = 0; j < k; j++) {
                int l = io.nextInt();
                int r = io.nextInt();
                int t = io.nextInt();
                rules.add(new int[] { l, r, t });
            }
            io.println(solution(nums, rules));
        }

        io.close();
    }

    public static int solution(int[] arr, List<int[]> rules) {
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        int out = arr.length;
        for (int[] rule : rules) {
            out = Math.min(out, cal2(arr, rule, map));
        }

        return out;

    }

    static int cal2(int[] arr, int[] rule, Map<Integer, Integer> map) {
        int start = findStart(arr, rule[0], map);
        int end = findEnd(arr, rule[1], map);
        return end - start + 1 - rule[2] + start + arr.length - 1 - end;
    }

    static int findStart(int[] arr, int num, Map<Integer, Integer> map) {
        if (map.containsKey(num)) {
            return map.get(num);
        }

        int out = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] >= num) {
                out = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;

            }
        }

        return out;

    }

    static int findEnd(int[] arr, int num, Map<Integer, Integer> map) {
        if (map.containsKey(num)) {
            return map.get(num);
        }

        int out = -1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= num) {
                out = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return out;

    }
}
