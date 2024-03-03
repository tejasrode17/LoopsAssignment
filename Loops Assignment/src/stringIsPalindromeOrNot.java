//Write a Java program to check if a given string is a palindrome or not using a loop.
public class stringIsPalindromeOrNot {
    public static void main(String[] args) {
        String str = "racecar"; // You can change this value to check if any string is a palindrome

        System.out.println("Is \"" + str + "\" a palindrome? " );
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Input must be a non-empty string");
        }
            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }

    return true;
    }
}
