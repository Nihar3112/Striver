package Logic_Building_Arrays;

public class MoveZero {
   
    public static void moveZeroes(int[] nums) {
        int index=0;
        int count=0;
        int n=nums.length;
        for(int i =0;i<n;i++){
        if(nums[i]==0){
            count++;
        }else{
            nums[index++]=nums[i];
        }

        }
        for(int i =index;i<n;i++){
            if(count>0){
            nums[i]=0;
            count--;}
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        
        moveZeroes(arr);
        
        // Print the elements
        for (int it : arr) {
            System.out.print(it + " ");
        }
        System.out.println();
    }
    
    

}
