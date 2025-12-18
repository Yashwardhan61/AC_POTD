package Day15;
import java.util.*;
public class A_Chewbacca_and_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            int digit = ch - '0';
            int inverted = 9 - digit;

            if (i == 0 && inverted == 0) {
                result.append(digit);
            } else if (inverted < digit) {
                result.append(inverted);
            } else {
                result.append(digit);
            }
        }

        System.out.println(result.toString());
        sc.close();
    }
}