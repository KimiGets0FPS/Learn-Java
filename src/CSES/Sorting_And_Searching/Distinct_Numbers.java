package CSES.Sorting_And_Searching;

import java.util.*;
import java.io.*;


public class Distinct_Numbers {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < num; i++) {
            nums.add(Integer.parseInt(st.nextToken()));
        }
        pw.println(nums.size());
        pw.close();
    }
}
