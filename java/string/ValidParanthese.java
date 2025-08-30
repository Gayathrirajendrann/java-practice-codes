import java.util.Scanner;

public class ValidParanthese {

    public boolean isvalidparanthese(char arr2[]) {
        int roundCount = 0; 
        int squareCount = 0; 
        int curlyCount = 0;  

        for (int i = 0; i < arr2.length; i++) {
            char currentChar = arr2[i];

           
            if (currentChar == '(') {
                roundCount++;
            } else if (currentChar == '[') {
                squareCount++;
            } else if (currentChar == '{') {
                curlyCount++;
            }
            
           
            else if (currentChar == ')') {
                if (roundCount == 0) {
                    return false; 
                }
                roundCount--;
            } else if (currentChar == ']') {
                if (squareCount == 0) {
                    return false; 
                }
                squareCount--;
            } else if (currentChar == '}') {
                if (curlyCount == 0) {
                    return false; 
                }
                curlyCount--;
            }
        }

       
        return roundCount == 0 && squareCount == 0 && curlyCount == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();  

        char arr2[] = new char[s1.length()];

        
        for (int i = 0; i < s1.length(); i++) {
            arr2[i] = s1.charAt(i);
        }

        ValidParanthese obj = new ValidParanthese();
        boolean result = obj.isvalidparanthese(arr2);
        System.out.println(result); 
    }
}
