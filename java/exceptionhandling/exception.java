import java.util.Scanner;
public class exception {
    private static int j;
    
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the number of elements");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                 arr[i]=sc.nextInt();
                 for(int j=0;j<arr.length;j++);{
                   try{
                     if(arr[i]!=arr[j]){
                        }
                    }catch(DublicationException e){
                       System.out.println("error")
                    }  
             }
        }
    }
}
