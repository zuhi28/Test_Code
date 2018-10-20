package training.Java_Training.Assignment_Day1_Sept6;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args){
        System.out.println("Enter three numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int tmp;
        if (a>b && a>c)
            System.out.println("Highest number is: " + a);
        else if (b>c)
            System.out.println("Highest number is: " + b);
        else
            System.out.println("Highest number is: " + c);

    }
}
