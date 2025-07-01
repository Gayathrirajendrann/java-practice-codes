import java.util.*;
public class Array2D {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("n1:");
        int n1=sc.nextInt();
        System.out.println("n2:");
        int n2=sc.nextInt();

        int [][] arr = new int [n1][n2];
        System.out.println("enter the value");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                arr[i][j]=sc.nextInt();

            }


        }

        System.out.println("array :");
        for(int n [] : arr){
            for(int b : n)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }

        System.out.println("transpose");

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[j][i]=arr[i][j];
                System.out.print(arr[i][j]+" ");
                

            }
            System.out.println();

            

        }



        
    }
}

