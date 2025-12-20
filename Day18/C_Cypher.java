package Day18;
import java.util.*;

public class C_Cypher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                int b = sc.nextInt();
                String moves = sc.next();

                for (int j = 0; j < b; j++) {
                    char ch = moves.charAt(j);

                    if (ch == 'D') {
                        a[i] = (a[i] + 1) % 10;
                    } else { 
                        a[i] = (a[i] + 9) % 10;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
