import java.io.*;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) 
    {
        int arr[]={10,20,30,40,50};
        int n=arr.length-1;
        for(int i=0;i<n/2;i++)
        {
                int temp = arr[i];
                arr[i]=arr[n-i];
                arr[n-i]=temp;
        }
        for(int e : arr)
        {
            System.out.println(e);
        }
        
    }
    
}
