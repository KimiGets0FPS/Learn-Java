package USACO.S17.Open.Problem_2;

import java.util.*;
import java.io.*;


public class Bovine_Genomics {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\zhewe\\OneDrive\\Documents\\Coding Projects\\Learn-Java\\src\\USACO\\S17\\Open\\Problem_2\\cownomics.in"));
        PrintWriter pw = new PrintWriter("C:\\Users\\zhewe\\OneDrive\\Documents\\Coding Projects\\Learn-Java\\src\\USACO\\S17\\Open\\Problem_2\\cownomics.out");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<StringBuilder> spotty_cow = new ArrayList<>();
        for (int i=0;  i < n;  i++) {
            st = new StringTokenizer(br.readLine());
            String cow = st.nextToken();
            spotty_cow.add(new StringBuilder());
            for (int j=0;  j < m;  j++) {
                spotty_cow.get(i).append(cow.charAt(j));
            }
        }

        List<StringBuilder> plain_cow = new ArrayList<>();
        for (int i=0;  i < n;  i++) {
            st = new StringTokenizer(br.readLine());
            String cow = st.nextToken();
            plain_cow.add(new StringBuilder());
            for (int j=0;  j < m;  j++) {
                plain_cow.get(i).append(cow.charAt(j));
            }
        }

        System.out.println(spotty_cow);
        System.out.println(plain_cow);



        pw.close();
    }

}
