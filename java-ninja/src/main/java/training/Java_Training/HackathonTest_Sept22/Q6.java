package training.Java_Training.HackathonTest_Sept22;

/**
 * Q6.	WJP to perform ascending order Selection sort.
 */
public class Q6 {
    public static void main(String[] args) {
        int[] unsortedArray = {1,2,-3,5,6};
        sortArrayUsingSelectionSort(unsortedArray);
        for (int n:unsortedArray){
            System.out.print(n + " ");
        }
    }

    private static void sortArrayUsingSelectionSort(int[] unsortedArray) {
        for (int i=0; i<unsortedArray.length; i++){
            for (int j=i; j<unsortedArray.length; j++){
                if (unsortedArray[i]>unsortedArray[j]){
                    int tmp= unsortedArray[i];
                    unsortedArray[i]=unsortedArray[j];
                    unsortedArray[j]=tmp;
                }
            }
        }
    }
}
