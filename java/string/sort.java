import java.util.Scanner;
public class sort {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if((arr[i]>0) && (n>0)){
               if(arr[i]>max){
                  max=arr[i];
               }
            }
            else{
                System.out.println("Invalid Input");
            }
        }
        int min=max;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}