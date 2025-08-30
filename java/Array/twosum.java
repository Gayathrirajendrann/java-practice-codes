import java.io.*;
import java.util.*;
public class twosum {
    public static void main(String[] args) {
        int arr[]={2,7,9,11};
        int arr2[]=new int[2];
        int target=9;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int value=arr[i]+arr[j];
                if(value==target){
                    arr2[0]=i;
                    arr2[1]=j;
                }
            }
        }
        for(int e : arr2){
            System.out.println(e);
        }
        

    }
}
    

