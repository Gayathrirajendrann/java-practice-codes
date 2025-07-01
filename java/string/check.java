public class check {
        public static void main(String[] args) {
            //  I=1;
            //  V=5;
            //  X=10;
            //  L=50;
            //  C=100;
            //  D=500;
            //  M=1000;
            String s ="MCMXCIV";
            int num = 0;
            int i=0;
            while( i!=s.length()){
                char ch = s.charAt(i);
                if(ch=='I'){
                    num+=1;
                    i++;
                }
                else if(ch=='V'){
                    num+=5;
                    i++;
                }
                else if(ch=='X'){
                    num+=10;
                    i++;
                }
                else if(ch=='L'){
                    num+=50;
                    i++;
                }
                else if(ch=='C'){
                    num+=100;
                    i++;
                }
                else if(ch=='D'){
                    num+=500;
                    i++;
                }
                else if(ch=='M'){
                    num+=1000;
                    i++;
                } 
            }
            for(int j=1;j<s.length();j++){
                if(s.charAt(j-1)=='I'){
                    if ((s.charAt(j)=='V') || (s.charAt(j)=='X')){
                    num-=2;
                    }
                }
                else if(s.charAt(j-1)=='X'){
                    if ((s.charAt(j)=='L') || (s.charAt(j)=='C')){
                    num-=20;
                }
                }
                else if(s.charAt(j-1)=='C'){
                    if ((s.charAt(j)=='D') || (s.charAt(j)=='M')){
                    num-=200;
                    }
                }
            }
         System.out.println(num);
    }
}
