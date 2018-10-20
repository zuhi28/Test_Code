package training.Java_Training.Assignment_Day1_Sept6;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of digits which you want to choose: ");
        int size = input.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the number which need to be checked, whether it is palindrome: ");
        for (int i =0; i<size;i++)
            a[i]= input.nextInt();
        for (int j =0; j<size; j++){
            if (a[j]==a[size-1-j])
                break;
        }
        System.out.println("Yes the number is Palindrome");
    }
}
