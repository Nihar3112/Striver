package Logic_Building_Arrays;
public class RemoveDuplicate{
    public static int duplicates(int[] arr) {
        int i=0;
        System.out.print(" Duplicates are : "+arr[i]);
        for(int j=0;j<arr.length;j++){
            
            if(arr[i] != arr[j]){
             arr[i+1] = arr[j];
             System.out.print(" "+arr[i+1]);
             i++;

            }
 
         }

         return (i+1);
    }
    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 3, 5, 6};
       System.out.println("\n Size is : "+duplicates(arr));
       
    }
}