package homeworks.hm7;

public class StringOperations {

    public int findSymbolOccurance(String str, char c1) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            char c2 = str.charAt(i);
            if (c2 == c1) {
                counter++;
            }
        }
        return counter;
    }

    public int findWordPosition(String source, String target) {
        if (!source.contains(target)) {
            return -1;
        } else {
            return source.indexOf(target);
        }
    }

    public String stringReverse(String str) {
        StringBuilder strb = new StringBuilder();  // I did it with loop, but I can do it with "return new StringBuilder(str).reverse.toString()"
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            strb.append(c);
        }
        return String.valueOf(strb);
    }

    public boolean isPalindrome(String str) {
        String reverseString = new StringBuilder(str).reverse().toString();
        return str.equals(reverseString);
    }


    public static void main(String[] args) {
        StringOperations str = new StringOperations();
        System.out.println("Char repeated " + str.findSymbolOccurance("Hillel hillel", 'l') + " times in a string");
        System.out.println("Target in source starts at index: " + str.findWordPosition("Hillel", "el"));
        System.out.println("Reverse string: " + str.stringReverse("Hillel hillel"));
        System.out.println("String is a palindrome: " + str.isPalindrome("repaper"));

    }
}
