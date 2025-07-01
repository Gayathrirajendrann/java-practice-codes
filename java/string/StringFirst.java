public class StringFirst {
    public static void main(String args[]) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println(str1 + "Address: " + System.identityHashCode(str1));
        System.out.println(str2 + "Address: " + System.identityHashCode(str2));
        System.out.println(str3 + "Address: " + System.identityHashCode(str3));
        System.out.println(str4 + "Address: " + System.identityHashCode(str4));
        System.out.println("String hashCode :" + str1.hashCode());
        System.out.println("String hashCode :" + str2.hashCode());
        System.out.println("String hashCode :" + str3.hashCode());
        System.out.println("String hashCode :" + str4.hashCode());
        String str6 = str1.toLowerCase();
        System.out.println(str6 + " Hashcode: " + str6.hashCode());
        System.out.println("String hashCode :" + str1.hashCode());
        String str5 = "hello";
        System.out.println("hashcode" + str5.hashCode());
        String str7 = "";
        System.out.println("Str7 hashCode :"
                + str7.hashCode());
        System.out.println(str7 + "Address of str7: " + System.identityHashCode(str7));
        for (int i = 0; i < str1.length(); i++) {
            str7 += str1.charAt(i);
        }
        System.out.println("String Str7 :" + str7);
        System.out.println("Str7 hashCode :"
                + str7.hashCode());
        System.out.println(str7 + "Address of str7: " + System.identityHashCode(str7));
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
    }
}