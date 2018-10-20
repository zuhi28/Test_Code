package training.Java_Training.Assignment_Day1_Sept6;

import java.util.Scanner;


public class PrimeNumberCheck {
    public static String primeCheck(int x){
        for (int i=2; i<x; i++){
            if (x%i!=0)
                System.out.println("Number is Prime");
            else
                System.out.println("Number is not prime");
        }

        return null;
    }
    public static void main(String[] args) {
        System.out.print("Enter the number to check: ");
        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt();
        System.out.println("Result is: " + primeCheck(input));
    }
}
