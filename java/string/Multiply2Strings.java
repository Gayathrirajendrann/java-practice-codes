class Multiply2String {
    public static int stringtonum(String n){
        int v=0;
        int start =0;
            if(n.charAt(0)=='-'){
                start=1;
            }
            for(int i=start;i<n.length();i++){
                
                v=v*10;
                int s=(int)n.charAt(i) - '0';
                v=v+s;
            }
        return v;
    }
    
    public static void main(String[] args) {
        String n= "-66";
        String m = "-3";
        int min=0;
        if(((n.charAt(0)=='-')||(m.charAt(0)=='-')) && !((n.charAt(0)=='-') && (m.charAt(0)=='-'))){
            min=1;
        }
        
        //System.out.println(min);
        
        int r1 = stringtonum(n);
        int r2 = stringtonum(m);
        System.out.println(r1);
        System.out.println(r2);
        
        if(min==1){
           System.out.println("-"+(r1*r2));
        }
        else{
            System.out.println(r1*r2);
        }
        
        
    }
}