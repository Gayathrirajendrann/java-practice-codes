import java.util.Scanner;

class mallowgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            long n = sc.nextLong();
            int moves = 0;
            
            while (n > 1) {
                moves++;
                if ((n & (n - 1)) == 0) { // n is power of 2
                    n = n / 2;
                } else {
                    n = n - Long.highestOneBit(n);
                }
            }
            
            if (moves % 2 == 0) {
                System.out.println("Richard");
            } else {
                System.out.println("Louise");
            }
        }
    }
}
