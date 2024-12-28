package Arrays_Medium;

import java.util.*;

public class Leaders {
    public static ArrayList<Integer> leaders(int[] nums) {
       ArrayList<Integer> ls = new ArrayList<>();
        // int max=Math.max(max);
        
     for(int i=0;i<nums.length;i++){
        boolean isleader=true;
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]>=nums[i]){
                isleader=false;
                break;
            }
        }
        if(isleader == true){
            ls.add(nums[i]);
        }
     }
     return ls;
    }
    public static void main(String[] args) {
        int[] nums={5,4,3,6,6,2};
        ArrayList<Integer> arr = leaders(nums);
        for(int num : arr){
            System.out.print(" "+num);
        }
    }
}
