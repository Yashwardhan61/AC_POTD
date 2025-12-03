package Day4;
import java.util.*;
public class A_Next_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[n];
        
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        if(k<1||k>n){
            System.out.println(0);
            return ;
        }
        
        int hold= scores[k - 1];
        int count = 0;
        
        for (int x : scores) {
            if (x >= hold && x > 0) {
                count++;
            }
        }
        
        System.out.println(count);
        sc.close();
    }
}// Time complexity=O(n)