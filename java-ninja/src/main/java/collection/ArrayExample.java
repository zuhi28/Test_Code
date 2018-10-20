package collection;

import java.util.Random;
import java.util.ArrayList;

public class ArrayExample {
    public static void main(String[] args) {
        //sortArray(new int[]{1,2,65,66,6});
        //searchAnElementInArray(new int[]{1,2,3,4,5}, 9);
        //reverseAnArray(new int[]{1,9,5,6,7,8,3,4,5});
        //maximumOfAnArray(new int[]{1,9,5,6,7,8,3,4,5});
        //arrayCount1(10);
          treePattern();
    }

    private static void treePattern() {

        for(int i=7;i>0;i=i-2){
            for (int j=3; j-i/2>0;j--) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) {
                System.out.print(k);
            }
            System.out.println();
        }

        for(int i=1;i<=7;i=i+2){
            for (int j=3; j-i/2>0;j--) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) {
                System.out.print(k);
            }
            System.out.println();
        }
        int number =9;
        for(int i=1;i<=number;i=i+2){
            for (int j=number/2; j-i/2>=0;j--) {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void arrayCount(int n) {
        // Count the no of occurences of each item
        //int[] inputArray = {1, 2, 7, 6 ,1, 2 , 3,4 ,5, 6,67,7,7,8,3,2,5,2,4,45,5,6,6,7,7,7,3,2,2,2,2,2,3,4,4,56,6,7,7,7,7};
        int[] inputArray = {1, 2, 7, 6, 1, 2};
        ArrayList<Integer> checkedNumbers = new ArrayList<Integer>();
        for (int i = 0; i < inputArray.length; i++) {
            if (!checkedNumbers.contains(inputArray[i])) {
                int count = 0;
                for (int k = 0; k < inputArray.length; k++) {
                    if (inputArray[i] == inputArray[k]) {
                        count++;
                    }
                }
                checkedNumbers.add(inputArray[i]);
                System.out.println(inputArray[i] + " = " + count);
            }
        }
    }

    private static void maximumOfAnArray(int[] testArray) {
        int tmp = testArray[0];
        for (int i = 0; i < testArray.length; i++) {
            if (tmp < testArray[i])
                tmp = testArray[i];
        }
        System.out.println(tmp);
    }

    private static void reverseAnArray(int[] array) {
        for (int i = 0; i <= array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        for (int n : array)
            System.out.println(n);
    }

    private static void searchAnElementInArray(int[] array, int n) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (n == array[i]) {
                count++;
            }
        }
        if (count > 0)
            System.out.println("element exists in the array " + count + " times");
        else
            System.out.println("element does not exists");
    }

    private static void sortArray(int[] orgArray) {
        for (int i = 0; i < orgArray.length; i++) {
            for (int k = i; k < orgArray.length; k++) {
                if (orgArray[i] > orgArray[k]) {
                    int tmp = orgArray[i];
                    orgArray[i] = orgArray[k];
                    orgArray[k] = tmp;
                }
            }
        }
        for (int n : orgArray)
            System.out.println((char) n);
    }
}
