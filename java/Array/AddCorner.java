import java.util.Scanner;
public class AddCorner {
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

        //array

        for(int n [] : arr){
            for(int b : n)
            {
                System.out.print(b+" ");
            }
            System.out.println();
        }


        //print corner
        int n=arr.length-1;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if((i==0 && j==0)||(i==n && j==0)||(i==0 && j==n)||(i==n && j==n)){
                   System.out.println("corner element");
                   System.out.println(arr[i][j]);
                }
            }
     
    

    }
}
}