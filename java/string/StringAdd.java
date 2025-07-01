public class StringAdd {
    public static void main(String[] args){
        String s = "3ab2cc4def";
        StringBuffer str = new StringBuffer(s);
        StringBuffer str1 = new StringBuffer();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                int n=ch-'0';
                int n1=i;
                int m1=i;
                for(int j=i+1;j<s.length();j++){
                    char ch1 = s.charAt(j);
                    
                    if(ch1>='a' && ch1<='z'){
                        m1++;
                    }
                    else{
                        break;
                    }
                }
                String s2=str.substring(n1+1,m1+1);
                for(int k=0;k<n;k++){
                     str1.append(s2);
                }

            }
            
        }
        System.out.println(str1);
    }
}
