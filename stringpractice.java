public class stringpractice {
    public static void main(String[] args) {

        // Declare and initialize strings
        String str1 = "Hello";
        String str2 = "World";

        // 1. length()
        System.out.println("Length of str1: " + str1.length());

        // 2. concat()
        String combined = str1.concat(" " + str2);
        System.out.println("Concatenated String: " + combined);

        // 3. toUpperCase()
        System.out.println("Uppercase: " + str1.toUpperCase());

        // 4. toLowerCase()
        System.out.println("Lowercase: " + str2.toLowerCase());

        // 5. substring()
        System.out.println("Substring of str1: " + str1.substring(1, 4));

        // 6. equals()
        System.out.println("Are str1 and str2 equal? " + str1.equals(str2));

        // 7. replace()
        System.out.println("Replace l with x in str1: " + str1.replace('l', 'x'));

        // 8. charAt()
        System.out.println("Character at index 1 in str2: " + str2.charAt(1));
    }
}
