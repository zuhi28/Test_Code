package training.Java_Training.HackathonTest_Sept22;

/**
 * Q1.	Consider there is a 3 Boolean variable called a, b, c. Check if at least two out of three Booleans are true *
 */
public class Q1 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean[] arr = {a, b, c};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true)
                count++;
        }
        if (count >= 2)
            System.out.println("Yes, atleast two of them are true");
        else
            System.out.println("No, atleast two of them are not true");
    }

}
