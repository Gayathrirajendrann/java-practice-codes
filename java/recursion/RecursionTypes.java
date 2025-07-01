public class RecursionTypes {

    public void tailRecursion(int n, int result) {
        if (n == 0) {
            System.out.println("Tail Recursion Result: " + result);
            return;
        }
        tailRecursion(n - 1, result * n);
    }

    
    public void headRecursion(int n) {
        if (n == 0)
            return;
        headRecursion(n - 1);
        System.out.println("Head Recursion: " + n);
    }

    public int treeRecursion(int n) {
        if (n <= 1)
            return n;
        return treeRecursion(n - 1) + treeRecursion(n - 2);
    }
    public void indirectRecursionA(int n) {
        if (n <= 0)
            return;
        System.out.println("Indirect Recursion A: " + n);
        indirectRecursionB(n - 1);
    }

    public void indirectRecursionB(int n) {
        if (n <= 0)
            return;
        System.out.println("Indirect Recursion B: " + n);
        indirectRecursionA(n - 2);
    }

    public int nestedRecursion(int n) {
        if (n > 100)
            return n - 10;
        return nestedRecursion(nestedRecursion(n + 11));
    }

    public static void main(String[] args) {
        RecursionTypes recursion = new RecursionTypes();

        System.out.println("Executing Tail Recursion:");
        recursion.tailRecursion(5, 1);

        System.out.println("\nExecuting Head Recursion:");
        recursion.headRecursion(5);

        System.out.println("\nExecuting Tree Recursion:");
        int treeResult = recursion.treeRecursion(5);
        System.out.println("Tree Recursion Result: " + treeResult);

        System.out.println("\nExecuting Indirect Recursion:");
        recursion.indirectRecursionA(5);

        System.out.println("\nExecuting Nested Recursion:");
        int nestedResult = recursion.nestedRecursion(95);
        System.out.println("Nested Recursion Result: " + nestedResult);
    }
}