import java.io.*;
import java.util.*;
public class rotation {
    public static void main(String[] args) {
        int arr[]={2,7,9,1};
        int temp=arr[0];
        int n=arr.length;
        for(int i=0;i<n-1;i++){
              arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        for(int e: arr){
        System.out.print(e);
        }

    }
}
    

