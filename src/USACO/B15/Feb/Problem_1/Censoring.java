package USACO.B15.Feb.Problem_1;

import java.util.*;
import java.io.*;

public class Censoring {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("censor.in"));
        PrintWriter pw = new PrintWriter("censor.out");
        StringTokenizer st = new StringTokenizer(br.readLine());

        String word = st.nextToken();
        st = new StringTokenizer(br.readLine());
        String censor = st.nextToken();

        StringBuilder output = new StringBuilder();
        for (int i=0; i < word.length(); i++) {
            output.append(word.charAt(i));
            if (output.length() >= censor.length() && output.substring(output.length()-censor.length()).equals(censor)) {
                output.delete(output.length()-censor.length(), output.length());
            }
        }
        pw.println(output);
        pw.close();
    }
}
