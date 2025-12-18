package Day9;

public class RotateArray {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        int[] arr= new int[n];
        int i=0;
        for(i=0;i<n;i++){
        int newpos=(k+i)%n;
            arr[newpos]=nums[i];
            }
        for(i=0;i<n;i++){
        nums[i]=arr[i];
}
}
}//TC=O(n)
