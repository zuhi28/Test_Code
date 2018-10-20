package training.Java_Training.Assignment_Day1_Sept6;

import java.util.Scanner;

public class ReverseDigitsOfANumber {
    public static void main(String[] args){
        int tmp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total number of digits of the number: ");
        int size = input.nextInt();
        int[] a = new int[size];
        System.out.println("Enter a number which you want to reverse: ");
        for (int i=0; i<a.length;i++)
        a[i] = input.nextInt();
        for (int j=0; j<a.length/2; j++){
            tmp= a[j];
            a[j] = a[a.length-1-j];
            a[a.length-1-j]=tmp;

        }
        System.out.println("Reversed number is: ");
        for (int k=0; k<a.length; k++)
        System.out.print(a[k]);
    }
}
