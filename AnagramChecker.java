import java.util.Arrays;

public class AnagramChecker {
    public static boolean isAnagram(String firstString, String secondString) {
        char[] firstStringChars = firstString.toLowerCase().toCharArray();
        char[] secondStringChars = secondString.toLowerCase().toCharArray();
        Arrays.sort(firstStringChars);
        Arrays.sort(secondStringChars);
        return Arrays.equals(firstStringChars, secondStringChars);
    }

    public static void main(String[] args) {
        String firstString = "word";
        String secondString = "drow";
        if (isAnagram(firstString, secondString)) {
            System.out.println(firstString + " and " + secondString + " are anagrams.");
        } else {
            System.out.println(firstString + " and " + secondString + " are not anagrams.");
        }
    }
}
