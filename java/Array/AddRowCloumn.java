
import java.util.Scanner;

public class AddRowCloumn {
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
         //sum column 
        
        System.out.println("sum_column");
        int max=0;
        for(int i=0;i<arr[0].length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                
                    sum += arr[j][i];
                
            }
            if(sum>max){
                max=sum;
            }
            System.out.print("COl Sum"+sum+" ");
        } 

        System.out.println(); 
        System.out.println("max of col : "+max);  
        System.out.println();

        //rowsum
        int max2=0;
        System.out.println("sum_row");
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                
                    sum += arr[i][j];
                
            }
            if(sum>max2){
                max2=sum;
            }
            
            System.out.print("ROw Sum"+sum+" ");
        }
        System.out.println();   
        System.out.println("max of row : "+max2);
    
    }
}  

