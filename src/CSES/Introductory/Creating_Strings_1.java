package CSES.Introductory;

import java.util.*;
import java.io.*;

public class Creating_Strings_1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] n = st.nextToken().split("");
        char[] strings = new char[n.length];
        for (int i = 0; i < n.length; i++) {
            strings[i] = n[i].charAt(0);
        }
        TreeSet<String> output = new TreeSet<>();
        bt(output, strings, new boolean[strings.length], new ArrayList<>());
        pw.println(output.size());
        for (String i: output) {
            pw.println(i);
        }
        pw.close();
    }

    public static void bt(TreeSet<String> output, char[] strings, boolean[] ifused, List<Character> current) {
        if (current.size() == strings.length) {
            StringBuilder e = new StringBuilder();
            for (Character i: current) {
                e.append(i);
            }
            output.add(e.toString());
        }

        else {
            for (int i = 0; i < strings.length; i++) {
                if (!ifused[i]) {
                    ifused[i] = true;
                    current.add(strings[i]);
                    bt(output, strings, ifused, current);
                    current.remove(current.size()-1);
                    ifused[i] = false;
                }
            }
        }
    }
}
