package training.Java_Training.Assignment_Day1_Sept6;

import java.util.Scanner;

public class PrintPrimeNumbersInARange {
    public static void main(String[] args){
        int n=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting and ending numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        for (int i =a; i<b; i++){
            for (int j =2; j<i; j++){
                if (i%j!=0)
                    n=i;
            }
            System.out.println(n + " is a prime number");
        }

    }
}
