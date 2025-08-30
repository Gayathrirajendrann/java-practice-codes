import java.util.Scanner;
public class charcasechange {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i=0;i<s.length();i++){
           char ch = s.charAt(i);
           if (ch >= 'a' && ch <= 'z') { 
                ch-=32;
                System.out.print(ch+" ");
           }
          
           else if (ch >= 'A' && ch <= 'Z') { 
            ch+=32;
            System.out.print(ch+" ");
          }
          else{
            System.out.print(ch+" ");
          }


       } 
    }
}
