package training.Java_Training.HackathonTest_Sept22;

/**
 * Q3.	Given an array of integers, sort the integer values. *
 */
public class Q3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, -2, -1, 0};
        System.out.println("Sorted array is: ");
        sortArray(a);
        for (int k = 0; k < a.length; k++) {
            System.out.print(a[k] + " ");
        }
    }

    /**
     * Array getting sorted using Bubble sort
     *
     * @param a
     */
    private static void sortArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }

    }
}
