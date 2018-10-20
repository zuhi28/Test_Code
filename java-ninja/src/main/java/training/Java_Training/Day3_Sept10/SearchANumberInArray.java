package training.Java_Training.Day3_Sept10;

import java.util.Scanner;

public class SearchANumberInArray {
    public static void searchOfaNumberInArray(int[] a, int num) {
        num = 0;
        for (int i = 1; i < a.length; i++) {
            if (num == a[i])
                System.out.println("Yes the number is present in the array and it is at: " + i + "th position");;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter number of elements in array: ");
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        int[] x = new int[n];
        for (int i=0; i<n; i++)
            x[i]=userInput.nextInt();
        System.out.println("Enter the number to be searched: ");
        int num=userInput.nextInt();
    }
}
