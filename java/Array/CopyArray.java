import java.io.*;
import java.util.*;
public class CopyArray {
    public static void main(String[] args) {
        int arr1[]={10,20,30,40};
        int arr2[] = new int[5];
        int n1=arr1.length;
        int n2=arr2.length;
        if(n2>n1){
            for(int i=0;i<n1;i++)
            {
               
                    arr2[i]=arr1[i];
                
                
            }
        }
        else{
            System.out.println("Error: Cannot copy elements. Source array size is greater than destination array size.");
        }
        for(int e : arr2)
        {
            System.out.println(e);
        }
        

    }

    
}
