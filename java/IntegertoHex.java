public class IntegertoHex{
    public static void main(String[] args) {
        String s="";
        int n=188;
        while(n>0){
             int r=n%16;
             n=n/16;
             System.out.println(r);
             if(r>9){
               char c=(char)(65+(r-10));
               s=c+s;
             }
             else{
                s=r+s;
             }
             
        }
        System.out.println(s);
    }
}