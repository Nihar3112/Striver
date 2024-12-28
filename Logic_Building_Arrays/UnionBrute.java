package Logic_Building_Arrays;
import java.util.*;

public class UnionBrute {
    public static int[] unionArray(int[] nums1, int[] nums2) {
        Set<Integer> tr = new TreeSet<>();
    
        for(int num : nums1){
          tr.add(num);
        }
        
        for(int num : nums2){
          tr.add(num);
        }
    
        int[] union = new int[tr.size()];
        int i=0;
        for(int num : tr){
            union[i++]=num;
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

