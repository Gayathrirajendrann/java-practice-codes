public class ProductOfNumbers{
        
        public static void main(String[] args) {
            String arr[]={"procutNumber","add","add","add","add","add","getProduct","add"};
            int arr1[] = {-1,2,3,2,4,2,3,4};
            String result[] = new String[arr1.length];
            

            for(int i=0;i<arr.length;i++){
                String s = arr[i];
                if(arr[i]=="add"){    
                  String s1 = Integer.toString(arr1[i]);
                  result[i]=s1;
                }
                if(arr[i]=="getProduct"){
                    int n = arr1[i];
                    int index=i-1;
                    System.out.println("index"+index);
                    int p=1;
                    for(int j=0;j<n;j++){
                        p*=arr1[index];
                        index--;
                    }
                    result[i]=Integer.toString(p);
                }
          }
          for(String e:result){
            System.out.print(e+" ");
          }
    }
} 