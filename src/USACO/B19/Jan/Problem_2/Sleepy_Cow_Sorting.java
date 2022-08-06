package USACO.B19.Jan.Problem_2;

import java.util.*;
import java.io.*;

public class Sleepy_Cow_Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\zhewe\\OneDrive\\Documents\\Coding Projects\\Learn-Java\\src\\USACO\\B19\\Jan\\Problem_2\\sleepy.in"));
        PrintWriter pw = new PrintWriter("C:\\Users\\zhewe\\OneDrive\\Documents\\Coding Projects\\Learn-Java\\src\\USACO\\B19\\Jan\\Problem_2\\sleepy.out");
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] cows = new int[n];
        for (int i = 0; i < n; i++) {
            cows[i] = Integer.parseInt(st.nextToken());
        }

        int min = n-1;
        for (int i = n-2; i >= 0 ; i--) {
            if (cows[i] < cows[i+1]) {
                min = i;
            }
            else {
                break;
            }
        }

        pw.println(min);

        pw.close();
    }
    
}
