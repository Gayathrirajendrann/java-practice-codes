

class reshape {
    public static void main(String[] args) {
        int arr [][]={{1,2},{3,4}};
        int r=2;
        int c=4;
        int n = arr.length;
        int arr1[]=new int[arr.length*2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                
                
                arr1[n*i+j]=arr[i][j];
                
                
            }
        }  
        
        
        /*for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }*/
        
        int arr2[][] = new int[r][c];
        for(int i=0;i<c;i++){
           
                
                arr2[i/n][i%n]=arr1[i];
               
                
            } 
            
        
    
        
        
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
              System.out.print(arr2[i][j]+" ");
           }
           System.out.println();
        }
       
    }
}