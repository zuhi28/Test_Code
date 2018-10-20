package training.Java_Training.HackathonTest_Sept22;

/**
 *Q11. How to Split String in java?
 *
 */
public class Q11 {
    public static void main(String[] args) {
        //Answer: We can split string using split function and passing delimeter as parameter into it.
        String s1 = "United Nation";
        String[] array = s1.split(" ");
        for (String s:array)
        System.out.println(s);
    }
}
