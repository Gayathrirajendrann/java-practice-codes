import java.io.*;
import java.util.*;
public class SortArray {
    public static void main(String[] args) {
        int arr[]={2,7,9,1};
        int min = arr[0];
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
          {
            if(arr[j]<min){
               min = j;
            }
        
          } 
          int temp = arr[min];
          arr[min] = arr[i];
          arr[i] = temp;
        } 
        for(int e: arr){
        System.out.print(e);
        }

    }
}
    

