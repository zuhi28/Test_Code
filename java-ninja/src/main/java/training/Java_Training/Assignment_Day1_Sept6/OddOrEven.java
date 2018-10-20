package training.Java_Training.Assignment_Day1_Sept6;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number which you need to check: ");
        int n = input.nextInt();
        if (n%2==0)
            System.out.println("This is an even number");
        else
            System.out.println("This is a odd number");
    }
}
