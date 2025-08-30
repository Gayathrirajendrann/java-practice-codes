import java.util.Scanner;
public class pangram {
    public boolean ispangram(String s){
           int arr[] = new int[26];
           for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
             if (ch >= 'a' && ch <= 'z') { 
                arr[ch - 'a']++; 

            }
          }  
           for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return false;
            }
         }
          return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        pangram obj = new pangram();
        boolean result = obj.ispangram(s);
        System.out.println(result);

    }
}
