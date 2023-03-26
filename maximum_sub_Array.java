import java.util.*;

public class maximum_sub_Array {
    public static void max_sub(int arr[] ){
        int max_sum=0;
        int curr_sum=0;

        for(int i=0;i<arr.length;i++){
            curr_sum=curr_sum+arr[i];

            if(curr_sum>max_sum){
                max_sum=curr_sum;
            }

            if(curr_sum<0){
                curr_sum=0;
            }
        }
        System.out.println(max_sum);
    }
    public static void main (String [] args ){
        // int arr[] ={4,2,-4,5,-1,3};
        // int arr[] ={-2,1,-2,4,-1,2,1,-5,4};
        int arr[] ={5,4,-1,7,8};

        max_sub(arr);
    }    
}
