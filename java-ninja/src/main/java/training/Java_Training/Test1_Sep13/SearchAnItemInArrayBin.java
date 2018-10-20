package training.Java_Training.Test1_Sep13;

import java.util.Scanner;

public class SearchAnItemInArrayBin {
    public static void main(String[] args) {
        System.out.print("Enter the size of an array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        System.out.println("Enter the contents of an array: ");
        int[] a = new int[size];
        for (int i=0; i<size; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("Enter the digit to be searched: ");
        int n = input.nextInt();
        for (int j=0; j<size; j++){
            if (n==a[j])
                System.out.println("Yes the number is present and its at " + j +"th position");
            else
                System.out.println("Number is not present");
        }
    }
}
