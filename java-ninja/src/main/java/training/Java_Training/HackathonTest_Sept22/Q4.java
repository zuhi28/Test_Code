package training.Java_Training.HackathonTest_Sept22;

/**
 * Q4.	Given an array of integers check the Palindrome of the series.
 */
public class Q4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        boolean result = checkIfPalindrome(array);

        String r = (result ? "a" : "not a");
        System.out.println("Array is " + r + " palindrome! ");
    }

    private static boolean checkIfPalindrome(int[] array) {
        boolean isPalindrome = true;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;

    }
}
