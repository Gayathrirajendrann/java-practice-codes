import java.util.*;

public class check {
    public int[] closestPrimes(int L, int R) {
        int arr[] = {-1, -1};
        ArrayList<Integer> list = new ArrayList<>();
      
        for (int i = L; i <= R; i++) {
            if (isprime(i)) {
                list.add(i);
            }    
        }
        
        // Convert list to array properly
        // Integer[] list1 = list.toArray(new Integer[0]);
        
        // // Convert Integer array to int array
        // int[] result = new int[list1.length];
        // for (int i = 0; i < list1.length; i++) {
        //     result[i] = list1[i];
        // }
        
        return result;
    }

    static boolean isprime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        check obj = new check();
        int[] result = obj.closestPrimes(19, 31);  

        for (int e : result) {
            System.out.println(e);
        }
    }
}
