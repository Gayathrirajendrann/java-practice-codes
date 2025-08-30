class Multiply2String {
    // Convert string to integer
    public static int stringtonum(String n) {
        int v = 0;
        boolean negative = false;
        int start = 0;

        if (n.charAt(0) == '-') {
            negative = true;
            start = 1;
        }

        for (int i = start; i < n.length(); i++) {
            v = v * 10 + (n.charAt(i) - '0');
        }

        return negative ? -v : v;
    }

    public static void main(String[] args) {
        String n = "-66";
        String m = "-3";

        int r1 = stringtonum(n);
        int r2 = stringtonum(m);

        System.out.println(r1);   // -66
        System.out.println(r2);   // -3
        System.out.println(r1 * r2); // 198
    }
}
