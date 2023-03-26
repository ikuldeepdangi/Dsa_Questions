import java.util.*;

public class contains_duplicate {
    public static boolean check_dulicate(int arr[]){
        boolean c=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c=true;
                    return c;
                }
            }
        }
        return c;
    }
    public static void main(String [] args ){
        int arr[]={34,2,31,2};

        // check_dulicate(arr);
        System.out.println("duplicate element => " + check_dulicate(arr));
    }    
}
