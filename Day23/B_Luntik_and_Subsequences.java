package Day23;
import java.io.*;
import java.util.*;

public class B_Luntik_and_Subsequences {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

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

        long nextLong() {
            return Long.parseLong(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    static class FastWriter {
        BufferedWriter bw;

        FastWriter() {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        void print(Object obj) throws IOException {
            bw.append(String.valueOf(obj));
        }

        void println(Object obj) throws IOException {
            print(obj);
            bw.append("\n");
        }

        void close() throws IOException {
            bw.flush();
            bw.close();
        }
    }

    public static void main(String[] args) throws Exception {
        FastReader in = new FastReader();
        FastWriter out = new FastWriter();

        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();

            int cnt1 = 0;
            int cnt0 = 0;

            for (int i = 0; i < n; i++) {
                long x = in.nextLong();
                if (x == 1) cnt1++;
                else if (x == 0) cnt0++;
            }

            if (cnt1 == 0) {
                out.println(0);
            } else {
                long result = cnt1 * (1L << cnt0);
                out.println(result);
            }
        }

        out.close();
    }
}//Time Complexity: O(t × n)
