package Shift.Shift_K;

public class Optimal {
    public static void reverse(int[] arr,int left,int right) {
        
        while(left<right){
               int temp = arr[left];
               arr[left] = arr[right];
               arr[right] =temp;
               left++;
               right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 5, 3, -5};
        int k = 8;
        int n =arr.length;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);

        System.out.print("After Shifting: ");
        for(int i =0; i<arr.length;i++){

             System.out.print(" "+arr[i]);
        }
     }
}
