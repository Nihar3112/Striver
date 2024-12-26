import java.util.*;

public class Optimal{
public int second(int[] arr){
     if(arr.length <2){
        return -1;
     }  
     int largest = Integer.MIN_VALUE;
     int secondLargest = Integer.MIN_VALUE;  
     
     for(int i =0;i<arr.length;i++){
        if(arr[i]>largest){
             secondLargest=largest;
             largest=arr[i];
     }else if(arr[i]>secondLargest && arr[i] != largest){
        secondLargest=arr[i];
     }

    }
    return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
}
    public static void main(String args[]){
        int[] nums = {1,2,4,5,2,11,3};
        Optimal op = new Optimal();
        System.out.println("Second largest: "+op.second(nums));
    }
}