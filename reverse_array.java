import java.util.*;

public class reverse_array {
    public static void reverse(int arr[]){
        int rarr[]={0,0,0,0,0,0};
        int e=arr.length;

        for(int i=0;i<arr.length;i++){
            // interchange
            rarr[i]=arr[e];
            e--;
        }

    }
    public static void main(String []  args){
        int arr[]={1,2,3,4,5,6};

        reverse(arr);
        
    }
}
