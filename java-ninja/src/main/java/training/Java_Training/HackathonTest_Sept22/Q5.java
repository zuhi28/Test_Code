package training.Java_Training.HackathonTest_Sept22;

/**
 * Q5.	Given an array prints the unique numbers and also print the number of occurrences of duplicate numbers.
 */

public class Q5 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,5,5,5,6,7};
        checkUniqueNumber(array);
    }

    private static void checkUniqueNumber(int[] array) {
        for (int i=0; i<array.length; i++){
            int count=0;
            for (int j =0; j<array.length; j++){
                if (array[i]==array[j]){
                    count++;
                }
            }
            //TODO: Print repeated number just once.
            if (count==1) {
                System.out.println(array[i] + " is unique");
            }
            else {
                System.out.println(array[i]+ " is duplicated and repeated " + count +"times");
            }

        }
    }
}
