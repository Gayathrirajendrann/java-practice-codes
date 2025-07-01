import java.util.*;
public class MilkRate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the number of days : ");
        //int n = sc.nextInt();
        System.out.println("Enter number different quantity");
        int n2 = sc.nextInt();
        int arr[] =  new int [n2*2];
        System.out.println("Enter number \n the ML ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // addition
        int total=0;
        for(int i=0;i<arr.length-1;i+=2){
              int value = arr[i];
              int rate = arr[i]*arr[i+1];
              total+=rate;
        }
        System.out.println(total);
        float grandtotal=(total/100)*5.5f;
        System.out.printf("total Rupees : %.2f",grandtotal);

    }
}
