public class nestedrecursion{
public int nestedRecursion(int n) {
    if (n > 100)
        return n - 10;
    return nestedRecursion(nestedRecursion(n + 11));
 }
 public static void main(String[] args){
    nestedrecursion m = new nestedrecursion();
    int nestedResult = m.nestedRecursion(95);
    System.out.println("Nested Recursion Result: " + nestedResult);
    
 }
}