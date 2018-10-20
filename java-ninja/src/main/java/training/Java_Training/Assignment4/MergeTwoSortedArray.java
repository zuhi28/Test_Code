package training.Java_Training.Assignment4;
//TO Do-- Kindly check program once

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] mergedArray=mergeSortedArrays();
        for (int s: mergedArray)
        System.out.print(s + " ");

    }

    private static int[] mergeSortedArrays() {
        int array1[] = {1,2,4,6,9,10};
        int array2[] = {3,5,7,8};
        int sortedArray[] = new int[array1.length+array2.length];
        int i=0; int j=0; int k=0;
        while (i < array1.length && j < array2.length)
        {
            if (array1[i] < array2[j])
            {
                sortedArray[k] = array1[i];
                i++;
            }
            else
            {
                sortedArray[k] = array1[j];
                j++;
            }
            k++;
        }

        while (i < array1.length)
        {
            sortedArray[k] = array1[i];
            i++;
            k++;
        }

        while (j < array2.length)
        {
            sortedArray[k] = array2[j];
            j++;
            k++;
        }

        return sortedArray;
    }
    }