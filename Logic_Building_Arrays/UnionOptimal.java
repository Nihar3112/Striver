package Logic_Building_Arrays;

import java.util.ArrayList;
import java.util.List;

public class UnionOptimal {
      public static int[] unionArray(int[] nums1, int[] nums2) {
   List<Integer> tr = new ArrayList<>();
   int i=0,j=0;
   int n = nums1.length;
   int m= nums2.length;
   while(i<n && j<m){
    if(nums1[i]<=nums2[j]){
        if(tr.isEmpty() || tr.get(tr.size()-1) != nums1[i]){
            tr.add(nums1[i]);
        }
        i++;
    }
    else{
        if(tr.isEmpty() || tr.get(tr.size()-1) != nums2[j]){
            tr.add(nums2[j]);
        }
        j++;
    }
   }
    while(i<n){
        if(tr.isEmpty() || tr.get(tr.size()-1) != nums1[i]){
            tr.add(nums1[i]);
        }
        i++;
    }
    while(j<m){
         if(tr.isEmpty() || tr.get(tr.size()-1) != nums2[j]){
            tr.add(nums2[j]);
        }
        j++;
    }
   
    int[] union = new int[tr.size()];

    for (int k = 0; k < tr.size(); k++) {
            union[k] = tr.get(k);
        }
    return union;
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       int[] nums2 = {2, 3, 4, 4, 5, 11, 12};

       int[] union = unionArray(nums1, nums2);

       System.out.println("Union of nums1 and nums2 is:");
       for (int val : union) {
           System.out.print(val + " ");
       }
       System.out.println();
   }

}
