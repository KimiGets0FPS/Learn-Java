package USACO.S17.Open.Problem_2;


import java.util.*;
import java.io.*;


public class Bovine_Genomics {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("cownomics.in"));
        PrintWriter pw = new PrintWriter("cownomics.out");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        List<StringBuilder> spotty_cows = new ArrayList<>();
        for (int i=0;  i < n;  i++) {
            st = new StringTokenizer(br.readLine());
            String cow = st.nextToken();
            spotty_cows.add(new StringBuilder());
            for (int j=0;  j < m;  j++) {
                spotty_cows.get(i).append(cow.charAt(j));
            }
        }

        List<StringBuilder> plain_cows = new ArrayList<>();
        for (int i=0;  i < n;  i++) {
            st = new StringTokenizer(br.readLine());
            String cow = st.nextToken();
            plain_cows.add(new StringBuilder());
            for (int j=0; j < m; j++) {
                plain_cows.get(i).append(cow.charAt(j));
            }
        }

        int output = 0;

        for (int x = 0;  x < m-2;  x++) {
            for (int y = x + 1;  y < m-1;  y++) {
                for (int z = y + 1;  z < m;  z++) {
                    boolean flag = true;
                    Set<String> genetics = new HashSet<>();
                    for (int i = 0; i < n; i++) {
                        StringBuilder cow = new StringBuilder();
                        cow.append(spotty_cows.get(i).charAt(x));
                        cow.append(spotty_cows.get(i).charAt(y));
                        cow.append(spotty_cows.get(i).charAt(z));
                        genetics.add(cow.toString());
                    }
                    for (StringBuilder plain_cow : plain_cows) {
                        StringBuilder cow = new StringBuilder();
                        cow.append(plain_cow.charAt(x));
                        cow.append(plain_cow.charAt(y));
                        cow.append(plain_cow.charAt(z));
                        for (String genetic : genetics) {
                            if (cow.toString().equals(genetic)) {
                                flag = false;
                                break;
                            }
                        }
                        if (!flag) {
                            break;
                        }
                    }
                    if (flag) {
                        output ++;
                    }
                }
            }
        }

        pw.println(output);

        pw.close();
    }

}
