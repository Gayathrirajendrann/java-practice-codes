import java.util.Scanner;
public class courrence {
    public static void main(String[] args) {
        int arr [] = {1,2,3,2,3,4,1};
        boolean arr1[]= new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
         if(!arr1[i]){
            int temp=1;
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j])
               {
                    temp++;
                    arr1[j]=true;
               }

            }
            System.out.println(arr[i]+":"+temp);
            
         }  
       }

    }
      
}
