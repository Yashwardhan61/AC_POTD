package Day2;
import java.util.*;

public class A_Shizuku_Hoshikawa_and_Farm_Legs {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++){
            int count=0;
            int n = sc.nextInt();
            
            while((n!=0)&&(n%2==0)){
          
            if (n==4){
                count++;
                n=n/2;
            }
             else if(n>=4){
                count++;
                n=n-4;
            }
            else if (n>=2){
                count++;
                n=n/2;
            }
            else
                break;
        }
    System.out.println(count);
    }
    sc.close();
}
}
// Time complexity = 0(t*n)
