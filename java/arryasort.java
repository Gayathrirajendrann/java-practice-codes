import java.util.ArrayList;
import java.util.Scanner;

public class arryasort {
    public static void main(String[] args) {
        int n = 5;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Taking input
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            list.add(n1);
        }
        sc.close(); // Close Scanner

        int temp, temp2;
        for (int i = 0; i < n; i++) {
            temp = list.get(i); 
            //System.out.println("temp"+temp);
            for (int j = i + 1; j < n; j++) {
                if (temp > list.get(j)) {
                    
                    temp2 = list.get(j);
                    
                    //System.out.println("i: " + i);
                    //System.out.println("j: " + j);

                    
                    list.set(i, temp2);
                    list.set(j, temp);
                    //System.out.println("temp2"+temp2); 
                    //System.out.println("list: " + list);
                    
                    temp = temp2; 
                    //System.out.println("tempp"+temp);
                }
                
            }
        }

        
        System.out.println("Sorted List: " + list);
        int i=n-1;
        while(i!=0){
            System.out.print(list.get(i));
            i--;
        }
        System.out.print(list.get(0));
    }
}