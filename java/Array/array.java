
import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num=0;
        int [] arr;
        arr = new int[n];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        num=arr[0];
        int max2=arr[0];
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                num=arr[i+1];
            }
            else if(arr[i]<num && arr[i] != num){
                max2 = arr[i];
            }
        }
    
        System.out.println("add : "+(num+max2));
        


    }
}