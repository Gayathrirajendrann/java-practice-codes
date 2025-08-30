

// question 2 : https://www.geeksforgeeks.org/interview-experiences/mallow-technologies-interview-experience-set-1-on-campus/

class mallowgame{
     
     public static boolean ispower2(int n){
         while(n>1){
             if(n%2 != 0)
                  return false;
             n=n/2;          
         }
         return true;
     }
     
     public static int nearpower2(int n){
         while(n>1){
             if(!ispower2(n)){
                 n=n-2;
             }
             else{
                 break;
             }
         }
         return n;
     }
   
    public static void main(String args[]){
        int n=6;
        // boolean r = ispower2(n);
        // int r2 = nearpower2(n);
        int p=0;
        while(n>1){
            p++;
            if(ispower2(n)){
                n=n/2;
            }
            else{
                int m=nearpower2(n);
                n=n-m;
            }
        }
        if(p%2==0){
            System.out.println('k');
        }
        else{
            System.out.println('L');
        }
    }
}