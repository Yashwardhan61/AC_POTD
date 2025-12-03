package Day3;

import java.util.*;
public class A_Theatre_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();
        long a = sc.nextInt();
        long k=(n+a-1)/a;
        long l=(m+a-1)/a;
        long result=k*l;
        System.out.println(result);
        sc.close();
}
}//time Complxcity=O(1)
