package training.Java_Training.HackathonTest_Sept22;

/**
 * Q2.	write a program to find factorial (Non Recursive)
 */
public class Q2 {
    public static void main(String[] args) {
        int result = findFactorial(5);
        System.out.println("Factorial is: " + result);
    }

    /**
     * returns factorial of given number
     *
     * @param i
     */
    private static int findFactorial(int i) {
        int fact = 1;
        if (i == 0)
            fact = 1;
        else {
            for (int j = 1; j <= i; j++) {
                fact =  fact* j;
            }
        }
        return fact;
    }
}
