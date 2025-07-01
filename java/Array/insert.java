import java.io.*;
import java.util.*;
public class insert {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        
        int index = 2;
        int value = 9;

        int n=arr.length;
        for(int i=n-1;i>index;i--){
              arr[i]=arr[i-1];
        }
        arr[index]=value;
        
        for(int e: arr){
        System.out.print(e);
        }

    }
}
    

