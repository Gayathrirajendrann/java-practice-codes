public class optiValidParanthesis {
    public boolean isValid(String s) {
        int n = s.length()-1;
        for(int i=0;i<s.length();i++){
                int top=i;
                int end = n-i;
                if
        }
        
    }
    public static void main(String[] args) {
        String s = "([])"; //not suitable for input ([)]
        validParantheses obj = new validParantheses();
        boolean result = obj.isValid(s);
        System.out.println(result);
    }
}
