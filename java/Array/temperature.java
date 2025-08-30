public class temperature{
    public static void main(String[] args){
        int [] temperatures = {73,74,75,71,69,72,76,73};
        int arr[] = new int[temperatures.length];
        
        arr[0] = 1;
        
         for(int i=0;i<temperatures.length;i++){
            int temp=temperatures[i];
            int count=0;
            int c=0;
            for(int j=i+1;j<=temperatures.length-1;j++){   
                
              if(temperatures[j]>temp){
                c++;
                count=c;
                break;
              }
              c++;
              System.out.println("c"+c); 
            }
            arr[i]=count;
        } 
        for(int e:arr){
        System.out.print(e+" "); 

        } 
    }
}