public class RomanToInteger {
    // Function to get integer value of a Roman numeral
    public static int getValue(char ch) {
        if (ch == 'I') return 1;
        else if (ch == 'V') return 5;
        else if (ch == 'X') return 10;
        else if (ch == 'L') return 50;
        else if (ch == 'C') return 100;
        else if (ch == 'D') return 500;
        else if (ch == 'M') return 1000;
        return 0; 
    }

    
    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = getValue(s.charAt(i));

            // If current value is smaller than previous value, subtract it
            if (currValue < prevValue) {
                result -= currValue;
            } else {
                result += currValue;
            }

            prevValue = currValue; // Update previous value
        }

        return result;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(romanToInt("III"));      // Output: 3
        System.out.println(romanToInt("IV"));       // Output: 4
        System.out.println(romanToInt("IX"));       // Output: 9
        System.out.println(romanToInt("LVIII"));    // Output: 58
        System.out.println(romanToInt("MCMXCIV"));  // Output: 1994
    
    }
}
