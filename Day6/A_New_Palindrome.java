package Day6;
import java.util.*;

public class A_New_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String C = sc.next();
            boolean xx = true;
            int others = 0;

            for (int j = 1; j < C.length(); j++) {
                if (C.charAt(j) != C.charAt(0)) {
                    xx = false;
                    others++;
                }
            }
            if (xx) {
                System.out.println("NO");

            } else if (others == 1) {
                System.out.println("NO");
            } else {
                System.out.println("YES");

            }
        }
        sc.close();
    }
}// Time complexity=0(n*length)