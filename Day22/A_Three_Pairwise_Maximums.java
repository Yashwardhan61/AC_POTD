package Day22;
import java.io.*;
import java.util.*;

public class A_Three_Pairwise_Maximums {

    static class FastReader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static void main(String[] args) {
        FastReader in = new FastReader();
        StringBuilder sb = new StringBuilder();

        int t = in.nextInt();

        while (t-- > 0) {
            int[] arr = new int[3];
            arr[0] = in.nextInt();
            arr[1] = in.nextInt();
            arr[2] = in.nextInt();

            Arrays.sort(arr);

            if (arr[1] != arr[2]) {
                sb.append("NO\n");
            } else {
                sb.append("YES\n");
                sb.append(arr[0]).append(" ")
                  .append(arr[2]).append(" ")
                  .append(arr[0]).append("\n");
            }
        }

        System.out.print(sb.toString());
    }
}
//TC=O(t)