import java.util.Scanner;
public class anagaram {
    public boolean isAnagaram(char []arr1,char []arr2){
        char temp;
        for(int i=0;i<arr1.length;i++){
            boolean found = false;
            for(int j=i;j<arr2.length;j++){
              if(arr1[i]==arr2[j]){
                  temp = arr2[i];
                  arr2[i]=arr2[j];
                  arr2[j]=temp;
                  found = true;
              }

 
            }
            if (!found) {
                return false;
            }
          
        }
        return true;
        

    }

   public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      String s1 = sc.nextLine();
      String s2 = sc.nextLine();
      int n1=s1.length();
      int n2 = s2.length();
        if(n1==n2){
           char []arr1= new char[n1];
           char []arr2= new char[n2];
           for(int i=0;i<n1;i++){
               arr1[i]=s1.charAt(i);
              
               arr2[i]=s2.charAt(i);
            
            }
            anagaram obj = new anagaram();
            boolean result = obj.isAnagaram(arr1,arr2);
            System.out.println(result);
           }
        
        else{
            System.out.println("false");
        }
        
    }

}
    

