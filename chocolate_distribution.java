import java.util.*;

public class chocolate_distribution {
    public static void distribute(int arr[],int m ){
        //    sort
        Arrays.sort(arr);
        
        //    monitor-3pair(M)-catch minimum
        int min_Diff=99;
        int l=arr.length;
        for(int i=0;i<l-m;i++){
            // if(i==l-m){
            //     break;
            // }
                int diff=arr[i+m-1]-arr[i];
                    if(diff<min_Diff){
                    min_Diff=diff;
                }

        }
            System.out.println("diffrence => "+ min_Diff);
    }
    public static void main(String [] args){
        int arr[]={7,3,2,4,9,12,56};
        // int arr[]={3,4,1,9,56,7,9,12};
        // int arr[]={1,3,4,7,9,9,12,56};
        int m=3;

        distribute(arr,m);
    }
}
