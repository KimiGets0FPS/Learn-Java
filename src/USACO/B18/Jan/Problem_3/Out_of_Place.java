package USACO.B18.Jan.Problem_3;

import java.util.*;
import java.io.*;

public class Out_of_Place {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("outofplace.in"));
        PrintWriter pw = new PrintWriter("outofplace.out");

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int[] cows = new int[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            cows[i] = Integer.parseInt(st.nextToken());
        }

        int[] sorted_cows = cows.clone();
        Arrays.sort(sorted_cows);

        int output = 0;
        for (int i = 0; i < n; i++) {
            if (sorted_cows[i] != cows[i]) {
                output ++;
            }
        }

        pw.println(output-1);

        pw.close();
    }
    
}
