public class check {
    public static void main(String[] args){
        String s1 ="ABBA";
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(ch=='A'){
                int n;
                n='A'+1;
                System.out.printf("%c",n);
            }
            else{
                int n;
                n='B'-1;
                System.out.printf("%c",n);
            }
        }

      
        
    }
}
