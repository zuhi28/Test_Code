package Lynda.course1;
import java.util.Scanner;

public class WordCheckInString {
    public static void main(String[] args) {
        for(int i=1; i <= 100; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0)
                System.out.println();

            int a=4;
            int b=5;
            System.out.println("Before swap: " + "a is: " + a + "b is: " + b);
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println("a is now: " + b + "b is now: " + b);
        }
    }
}
