public class swapvalue {
    public static void main(String[] args){
        String str = "manbat";
        char[] arr = str.toCharArray();
        int i=0;
       while(i<arr.length-1){
            char temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i+=2;
        }
        System.out.println(new String(arr));
    }
    
}
