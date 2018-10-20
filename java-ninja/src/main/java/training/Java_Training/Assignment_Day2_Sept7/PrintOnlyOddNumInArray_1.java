package training.Java_Training.Assignment_Day2_Sept7;

import java.util.Scanner;

public class PrintOnlyOddNumInArray_1 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the size of an array: ");
            int size = input.nextInt();
            int a[] = new int[size];
            System.out.println("Enter contents of an array separated by space: ");
        for (int i =0; i<size; i++) {
            a[i] = input.nextInt();
            if (a[i] % 2 != 0)
                System.out.print(a[i] + "\t");

        }
    }
}
