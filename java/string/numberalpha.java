public class numberalpha {
    public static void main(String[] args){
      String s1="3a4b1c";
      for(int i=0;i<s1.length();i+=2){
         int count = s1.charAt(i)-'0';
        
         for(int j=0;j<count;j++){
            char ch = s1.charAt(i+1);
             System.out.print(ch+"");
        }
      } 
    }
}
