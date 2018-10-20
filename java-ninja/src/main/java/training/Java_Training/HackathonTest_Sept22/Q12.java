package training.Java_Training.HackathonTest_Sept22;

/**
 * Q12. Write a program to check palindrome (MalayalaM) for both numbers and string?
 */
public class Q12 {
    public static void main(String[] args) {
        int n = 12321;
        String s = "Malayalam";
        isPalindrome(String.valueOf(n));
        isPalindrome(s);
        isPalindrome("a");

    }

    private static void isPalindrome(String s) {
        String s1 = s.toLowerCase();
        boolean isPal = true;
        if (s1.isEmpty()) {
            System.out.println("String is empty");
        } else {
            for (int i = 0; i < s1.length() / 2; i++) {
                if (s1.charAt(i) != s1.charAt(s1.length() - 1 - i)) {
                    System.out.println(s1 + " is Not Palindrome!");
                    isPal = false;
                    break;
                }

            }
            if (isPal == true)
                System.out.println(s1 + " is Palindrome");
        }
    }
}
