import java.util.*;

public class max_min_inArray {
    // public static void min(int arr[]){
    //     int min=9999;

    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]<min){
    //             min=arr[i];
    //         }
    //     }

    //     System.out.println("Minimum element in  array -> "+ min);
    // }
    // public static void max(int arr[]){
    //     int max=0;

    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //         }
    //     }

    //     System.out.println("Maximum element in  array -> "+ max);
    // }

    public static void min_max(int arr[]){
            int min=arr[0];
            int max=arr[1];

            for(int i=0;i<arr.length;i++){
                if(min>arr[i]){
                    min=arr[i];
                }
                else if(max<arr[i]){
                    max=arr[i];
                }
            }
            System.out.println("MIN => "+ min + "\nMAx => "+max);
    }
    public static void main(String [] args){
            // int arr[]={32,4,2,-1,555,34,21};
            int arr[]={3,5,4,1,9};

        // min(arr);
        // max(arr);
        min_max(arr);

    }    
}
