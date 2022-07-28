package HackerRank;

import java.util.*;
import java.io.*;

public class Mini_Max_Sum {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.stream(nums).sorted();

        int[] min_arr = Arrays.copyOfRange(nums, 0, 4);
        int[] max_arr = Arrays.copyOfRange(nums, 1, 5);

        int min = 0;
        int max = 0;
        for (int i = 0; i < 5; i++) {
            min += min_arr[i];
            max += max_arr[i];
        }

        pw.print(min+" "+max);

        pw.close();
    }
}
