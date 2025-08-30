import java.io.*;
import java.util.*;
class Sum3 {
    
   
    public static void main(String args[]){
        int arr[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length;i++){
            if(i>0 && (arr[i]==arr[i-1])){
                continue;
            }
            
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int total = arr[i]+arr[j]+arr[k];
                
                if(total<0){
                    j++;
                }
                else if(total>0){
                    k--;
                    
                }
                else{
                    res.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    j++;
                }
                
                while((arr[j]==arr[j-1]) && j<k){
                    j++;
                }
                
            }
        }
        
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}