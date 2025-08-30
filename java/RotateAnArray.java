public class RotateAnArray {
    
 public static void main(String[] args) {
        int n=5;
    int R=2;
    int arr[] ={10,20,30,40,50};
    for(int i=n-R;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    for(int i=0;i<=R;i++){
        System.out.print(arr[i]+" ");
    }
 }
}
