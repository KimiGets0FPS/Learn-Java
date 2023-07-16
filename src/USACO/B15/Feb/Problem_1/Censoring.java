package USACO.B15.Feb.Problem_1;

import java.io.*;
import java.util.*;

public class Censoring {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\kiddy\\Desktop\\java stuff\\src\\USACO\\B15\\Feb\\Problem_1\\censor.in"));
        PrintWriter pw = new PrintWriter("C:\\Users\\kiddy\\Desktop\\java stuff\\src\\USACO\\B15\\Feb\\Problem_1\\censor.out");
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        st = new StringTokenizer(br.readLine());
        String target = st.nextToken();

        br.close();

        for (int i = 0; i < s.length(); i++) {
            boolean flag = true;
            for (int j = 0; j < target.length(); j++) {
                if (flag && s.charAt(i+j) == target.charAt(j)) {
                    
                }
            }
        }

        pw.close();
    }
}
