import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args){ 

       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();

       int[] arr = new int[n];

       for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
       }

       scanner.close();
       int negative_subarrays = 0;

       for(int i=0; i<n; i++){
           for(int j=i; j<n; j++){
               int current_sum = 0;
               for(int k=i; k<=j; k++)
               {
               current_sum += arr[k];
               }
               if(current_sum < 0){
                   negative_subarrays++;
               }
           }
       }
       System.out.println(negative_subarrays);
    }
} 