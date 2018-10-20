package training.Java_Training.Assignment_Day1_Sept6;

import java.util.Scanner;

public class SwappingNumbersWithoutThirdVar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the numebrs to be swapped: ");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("Before swap, values are as- " + "a: " + a +","+ "b: " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swap, values are as- " + "a: " + a +","+ "b: " + b);

    }
}
