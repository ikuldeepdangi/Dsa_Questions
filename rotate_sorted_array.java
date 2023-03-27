import java.util.*;


public class rotate_sorted_array {
    public static void rotate_array(int arr[],int p){
        int l=arr.length;
        // p%=l;

        // // for left rotation 
        // for(int i=0;i<l;i++){
        //     System.out.print(arr[(p+i)%l]);
        // }
        
        

        //     // for right rotation 
        // for(int i=0;i<l;i++){
        //     if(p>i){
        //         System.out.print(arr[l+i-p]);       // 3 4 5 6 1 2
        //     }
        //     else{
        //         System.out.print(arr[i-p]);
        //     }
        // }
        
    }
    public static void main(String [] args ){
        // int arr[] ={0,1,2,4,5,6,7};
        int arr[] ={1,2,3,4,5,6};
        int p=4;

        rotate_array(arr,p);
    }    
}













        //    [   TRIAL CODES ]

// 1st try ->
// int l=arr.length;
//         int rarr[];

//             for(int i=p;i<l;i++){
//                 for(int j=0;j<l-p;j++){
//                     rarr[j]=arr[i];
//                 }
//             }

//             for( int i=0;i<p-1;i++){
//                 for(int  j=l-p;j<p;j++){
//                     rarr[j]=arr[i];
//                 }
//             }
//         int rl=rarr.length;
            // for(int k=0;k<rl;k++){
            //     System.out.println(rarr[k]+" ");
            // }


// 2 nd try ->
// if(p==arr.length-1){
//     // swap
//     int temp=arr[i];
//     arr[i]=arr[p];
//     arr[p]=temp;
//     break;
// }
// // swap
// int temp=arr[i];
// arr[i]=arr[p];
// arr[p]=temp;
// p++;
// for(int k=0;k<arr.length;k++){
//     System.out.print(arr[k]+" ");
// }
