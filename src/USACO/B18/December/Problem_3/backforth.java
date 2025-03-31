//package USACO.B18.December.Problem_3;
//
//import java.io.*;
//import java.util.*;
//
//public class backforth {
//    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new FileReader("backforth.in"));
//        PrintWriter pw = new PrintWriter("backforth.out");
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        String[] p1 = st.nextToken().split(" ");
//        String[] p2 = st.nextToken().split(" ");
//        int[] b1 = new int[p1.length];
//        int[] b2 = new int[p2.length];
//        for (int i=0; i<p1.length; i++) {
//            b1[i] = Integer.parseInt(p1[i]);
//            b2[i] = Integer.parseInt(p2[i]);
//        }
//        pw.println(home(b1, b2));
//        pw.close();
//    }
//    public static int home(int[] b1, int[] b2) {
//        List<Integer> output = new ArrayList<>();
//        boolean barn = true;
//        bt(b1, b2, output, new boolean[b1.length], new ArrayList<>(), barn);
//        return output.size();
//    }
//    static void bt(int[] b1, int[] b2, List<Integer> output, boolean[] ifused, List<Integer> current, boolean barn) {
//        if (current.size() == 4) {
//            int sum = 0;
//            for (Integer integer : current) {
//                sum += integer;
//            }
//            output.add(sum);
//        }
//        else {
//            if (barn) {
//                for (int i=0; i<b1.length; i++) {
//                    barn = false;
//                    current.add(b1[i]);
//
//                }
//            }
//            else {
//                barn = true;
//                current.add(b2[i]);
//
//            }
//        }
//    }
//}
