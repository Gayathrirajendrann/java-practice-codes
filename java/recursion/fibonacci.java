public class fibonacci {
    
    public void fibo(int a,int  b,int n,int i){
         if(i<n) {
          int t=a+b;
          System.out.println(t);
         
          fibo(b, t, n,++i); 
        }
    } 
    public static void main(String[] args){
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=5;
        int i=2;
        fibonacci obj = new fibonacci();
        obj.fibo(a,b,n,i);

    }
}
