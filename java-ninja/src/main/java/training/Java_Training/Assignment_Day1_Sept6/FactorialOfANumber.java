package training.Java_Training.Assignment_Day1_Sept6;

import java.util.Scanner;

public class FactorialOfANumber {
    public static int factorial(int x){
        if (x==0)
        return 1;
            else
        return(x*factorial(x-1));
    }
    public static void main(String[] args) {
        System.out.print("Enter the number to calculate factorial: ");
        Scanner userInput = new Scanner(System.in);
        int input = userInput.nextInt();
        System.out.println("Factorial of " + input + " is: " + factorial(input));


    }
}
