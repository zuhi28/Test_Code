package training.Java_Training.Day3_Sept10;

import java.util.Scanner;

public class MinOfArray {
    public static int minOfArray(int[] a){
        int min= a[0];
        for (int i =1; i<a.length; i++) {
            if (min>a[i])
                min = a[i];
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println("Enter number of elements");
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();
        int[] x = new int[n];
        System.out.print("Enter the contents of an array: ");
        for (int i = 0; i < n; i++)
            x[i] = userInput.nextInt();
        System.out.println("Min number of this array is: " + minOfArray(x));
    }
}
