package Day20;

public class Bottles {
     public int numWaterBottles(int numBottles, int numExchange) {
        int total=0;
        int emp=0;
        while(numBottles>0){
            total+=numBottles;
            emp+=numBottles;
            numBottles=emp/numExchange;
            emp=emp%numExchange;
        }
        return total;
    }
}//TC= O(log n)

