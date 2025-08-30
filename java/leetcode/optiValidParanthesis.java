import java.util.Stack;

public class optiValidParanthesis {

    public boolean isValid(String s) {
        // Use a stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push to stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            // If it's a closing bracket
            else {
                if (stack.isEmpty()) {
                    return false; // No opening bracket to match
                }
                char top = stack.pop();
                // Check if it matches
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // Valid if no unmatched opening brackets left
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1 = "([])";   // ✅ valid
        String s2 = "([)]";   // ❌ invalid
        String s3 = "{[()]}"; // ✅ valid
        String s4 = "(((";    // ❌ invalid

        optiValidParanthesis obj = new optiValidParanthesis();

        System.out.println(s1 + " -> " + obj.isValid(s1));
        System.out.println(s2 + " -> " + obj.isValid(s2));
        System.out.println(s3 + " -> " + obj.isValid(s3));
        System.out.println(s4 + " -> " + obj.isValid(s4));
    }
}
