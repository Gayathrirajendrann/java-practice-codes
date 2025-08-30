public class validParantheses {
        public boolean isValid(String s) {
            int count1=0;
            int count2=0;
            int count3=0;
            int c1=0;
            int c2=0;
            int c3=0;
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                if(ch=='('){
                    
                    count1++;
                     c1=i;
                    System.out.println("(" + count1);
                }
                if(ch=='['){
                    count2++;
                    c2=i;
                    System.out.println("[" + count2);
                    
                }
                if(ch=='{'){
                    count3++;
                    c3=i;
                    System.out.println("{" + count3);
                    
                }
                if(ch==')' && (c1+i %2) !=0){
                    count1--;
                    
                }
                if(ch==']' && (c2+i %2) !=0){
                    count2--;
                }
                if(ch=='}' && (c3+i %2) !=0){
                    count3--;
                }
            }
            if(s.length()==1){
              return false;
            }
            if(count1 ==0 && count2==0 && count3==0){
                return true;
            }
            return false;
            
        }
        public static void main(String[] args) {
            String s = "([)]"; 
            validParantheses obj = new validParantheses();
            boolean result = obj.isValid(s);
            System.out.println(result);
        }
}
