import java.util.*;

public class A_Soldier_and_Bananas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long n = sc.nextLong();
        int w = sc.nextInt();
        
        long total = (long) k * w * (w + 1) / 2;
        long bo= total - n;
        
        if (bo > 0) {
            System.out.println(bo);
        } else {
            System.out.println(0);
        }
        
        sc.close();
    }

}
