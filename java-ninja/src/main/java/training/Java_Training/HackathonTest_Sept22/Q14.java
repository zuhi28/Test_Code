package training.Java_Training.HackathonTest_Sept22;

/**
 *Q14. Given a string print the reverse of the words string.(Input: Java Code Output: Code Java)
 */
public class Q14 {
    public static void main(String[] args) {
        String s = "United Nation";
        String result =reverseOfAString(s);
        System.out.println(result);
    }

    private static String reverseOfAString(String s1) {
        char[] s = s1.toCharArray();
        for (int i=0; i<s.length/2; i++){
            char tmp=s[i];
            s[i]=s[s.length-1-i];
            s[s.length-1-i]=tmp;
            //System.out.println(s[i] +" "+ s[s.length-1-i]);
        }

        return String.valueOf(s);
    }
}
