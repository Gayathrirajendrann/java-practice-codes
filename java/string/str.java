

public class str {
    public static void main(String[] args){

       //String str1="";
        /*String str2 = "hello";
        
         str1=str2.replace('h','H');
        System.out.println(str1);*/
        
        //String str = "hello";
        
      /*  for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
                System.out.println(ch);
            }
        }*/

       String str ="hello";
       int n=str.length()-1;
       for(int i=0;i<str.length();i++){
        char ch=str.charAt(n-i);
        System.out.print(ch); 
       }

        
  }
}
