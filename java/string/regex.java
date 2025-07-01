public class regex {
    public static void main(String[] args){
        String password = "pass@123";
        if(password.length()>8 &&
        password.matches(".*[A-Z].*")&&
        password.matches(".*[a-z].*")&&
        password.matches(".*[0-9].*")&&
        password.matches(".*[@#$%^&+=].*")){
            System.out.println("valid password");
        }
        else{
            System.out.println("not valid password");
        }
    }
}
