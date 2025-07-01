public class LongestOccurring{
    public static void main(String[] args){
        int arr[] = {1,3,3,2,1,1,4,4,4,4};
        int n = arr.length;
        int count1=0;
        int integer=0;
        for(int i=0;i<arr.length;i++){
              int  L =i;
              int R = n-1;
              System.out.println("R :"+R);
              System.out.println("L :"+L);
              int count2=0;
              while(i<R){
                
                int n1=L;
                int n2=R;
                System.out.println("n1 :"+arr[n1]);
                System.out.println("n2 :"+arr[n2]);
                  if(arr[n1]==arr[n2]){
                     count2++;
                     System.out.println("count2 :"+count2);
                  }
                  R--;
              }
              if(count2>count1 && integer!=arr[i]){
                       integer = arr[i];  
            }          count2=count1;
        }
        System.out.println("LogestOcuuring integer :"+integer);
        
    }
}