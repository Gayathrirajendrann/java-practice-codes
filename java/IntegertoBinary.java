public class IntegertoBinary {
    public static void main(String[] args) {
        String s="";
        int n=-10;
        int arr[]=new int[32];
        int index=0;
        while(n>0){
            int r=n%2;
             n=n/2;
             s=r+s;
        }
        if(n<0){
             n=-(n+1);
             while(n>0){
              int r=n%2;
              n=n/2;
              arr[index]=r;
              index++;
             }
             for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    arr[i]=1;
                }
                else{
                    arr[i]=0;
                }
                s=arr[i]+s;
             }
             
        }
        System.out.println(s);
    }
}
