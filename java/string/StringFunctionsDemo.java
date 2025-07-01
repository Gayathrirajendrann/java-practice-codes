public class StringFunctionsDemo {
    public static void main(String[] args) {
        String str = "  Hello World  .";
        System.out.println("Length of the string: " + str.length());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Trimmed string: " + str.trim());
        System.out.println("Stripped string: " + str.strip());
        System.out.println("String without leading spaces: " + str.stripLeading());
        System.out.println("String without trailing spaces: " + str.stripTrailing());
        String str2 = "hello.";
        String str3 = "123";
        String str4 = "banana.";
        String str5 = "HELLO.";
        System.out.println("Replaced 'World' with 'Java': " + str.replace("World",
                "Java"));
        System.out.println("Second word after splitting: " + str.split(" ")[1]);
        System.out.println("Joined string: " + String.join("-", "A", "B", "C"));
        System.out.println("Index of 'World': " + str.indexOf("World"));
        System.out.println("Last index of 'l': " + str.lastIndexOf("l"));
        System.out.println("Contains 'Hello': " + str.contains("Hello"));
        System.out.println("Starts with ' H': " + str.startsWith(" H"));
        System.out.println("Ends with ' ': " + str.endsWith(" "));
        System.out.println("Is 'hello' empty: " + str2.isEmpty());
        System.out.println("Equals 'HELLO' (ignore case): " +
                str2.equalsIgnoreCase(str5));
        System.out.println("Compare 'hello' with 'HELLO': " + str2.compareTo(str5));
        System.out.println("Compare 'hello' with 'HELLO' (ignore case): " +
                str2.compareToIgnoreCase(str5));
        System.out.println("Substring (2 to 5) in 'banana': " + str4.substring(2,
                5));
        System.out.println("Character at index 2 in 'banana': " + str4.charAt(2));
        System.out.println("Is '123' numeric: " + str3.matches("\\d+"));
        System.out.println("Lowercase equals 'hello': " +
                str.toLowerCase().equals(str2));
        System.out.println("Concatenated string: " + str4.concat(" Fruit"));
        System.out.println("Repeated string: " + str4.repeat(2));
        System.out.println("Replace first 'a' with 'A': " + str4.replaceFirst("a",
                "A"));
        System.out.println("Replace all 'a' with 'A': " + str4.replaceAll("a", "A"));
        System.out.println("String value of 100: " + String.valueOf(100));
        System.out.println("Is 'hello' blank: " + str2.isBlank());
        System.out.println("Length after removing leading spaces: " +
                str.stripLeading().length());

    }
}
