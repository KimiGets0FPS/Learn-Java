package USACO.B20.Feb.Problem_2;

import java.util.*;
import java.io.*;

public class Mad_Scientist {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("cowtip.in"));
        PrintWriter pw = new PrintWriter("cowtip.out");

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        char[] a = st.nextToken().toCharArray();

        st = new StringTokenizer(br.readLine());
        char[] b = st.nextToken().toCharArray();

        int ret = 0;
        while (!(new String(a).equals(new String(b)))) {
            ret++;
            int lhs = 0;
            while (a[lhs] == b[lhs]) {
                lhs++;
            }
            int rhs = n-1;
            while (a[rhs] == b[rhs]) {
                rhs--;
            }
            for (int i = lhs; i <= rhs; i++) {
                if (a[i] == 'G')  {
                    a[i] = 'H';
                }
                else {
                    a[i] = 'G';
                }
            }
        }
        pw.println(ret);
        pw.close();
    }
}
