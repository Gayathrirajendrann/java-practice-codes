import java.util.Scanner;


public class validpalindrome {
    public boolean ispalindrome(String s){
        String s2 = s;
        System.out.println(s2);

    }
   
    
}
public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
     validpalindrome  obj = new validpalindrome();
     boolean result  = obj.ispalindrome(s);

}
