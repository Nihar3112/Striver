package Arrays_Medium;

import java.util.ArrayList;

public class LeadersOptimal {
         
    public static ArrayList<Integer> leaders(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
         // int max=Math.max(max);
         int max = Integer.MIN_VALUE;
         int n = nums.length;
         ls.add(nums[n-1]);
         for(int i=n-2;i>=0;i--){
            if(nums[i]>max){
                ls.add(nums[i]);
            }
            max=Math.max(max, nums[i]);
         }
      return ls;
     }
    public static void main(String[] args) {
        int[] nums={-3, 4, 5, 1, -4, -5};
        ArrayList<Integer> arr = leaders(nums);
        for(int num : arr){
            System.out.print(" "+num);
        }
    }
}
