package Logic_Building_Arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOptimal {
     public static int[] intersectionArray(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int k = nums2.length;
        int left=0,right=0;
        List<Integer> tr = new ArrayList<>();
        while(left<m && right <k){
            if(nums1[left] == nums2[right]){
               // if we want that the array does not contains any duplicate then we can use this
                // if(tr.isEmpty() || tr.get(tr.size()-1) != nums1[left]){
                     tr.add(nums1[left]);
                //}
                left++;
                right++;
            }else{
                if(nums1[left]<nums2[right]){
                    left++;
                }else{
                    right++;
                }
            }
            }
            int[] intersection = new int[tr.size()];
            for(int l=0;l<tr.size();l++){
                intersection[l] = tr.get(l);
            }
            return intersection;
        }
        public static void main(String[] args) {
           int[] nums1 ={1,1,2,4,4,6,6,6,7,11,11,12,15,15,16,17,18,21,23,24,24,24,26,30,31,32,34,36,39,42,44,44,45,46,46,48,50};
           int[] nums2={1,4,4,5,7,7,8,9,9,9,12,13,15,16,21,21,25,27,27,28,30,30,32,33,33,34,35,38,38,38,39,39,39,40,41,42,42,42,43,43,44,45,46,46,47,47,47,49,50};
           int[] ans = intersectionArray(nums1,nums2);
           for(int l=0;l<ans.length;l++){
           System.out.println(ans[l]);
        }
        }
}
