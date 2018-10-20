package training.Java_Training.Assignment_Day2_Sept7;

public class BinarySearch {
    public static void main(String[] args){
        int[] a = {-2,1,5,9,10};
        int searchItem = 5;
        int start = 0;
        int end = a.length -1;
        while (end>start){
            int mid = (start+end)/2;
            if (a[mid]==searchItem) {
                System.out.println("Found item at: " + mid);
                break;
            }
            if (a[mid]<searchItem){
                start=mid;
            }
            if (a[mid]>searchItem){
                end=mid;
            }
        }



    }
}
