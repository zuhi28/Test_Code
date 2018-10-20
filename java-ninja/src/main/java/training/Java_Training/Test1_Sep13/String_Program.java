package training.Java_Training.Test1_Sep13;

import java.util.Scanner;

public class String_Program {
    public static void numberOfWords(){
        int n = 1;
        System.out.print("Enter the string: ");
        Scanner input = new Scanner(System.in);
        String sent = input.nextLine();
        for (int i = 0; i < sent.length(); i++) {
            if (sent.charAt(0)==(int)' ')
                System.out.println("Sentence is starting with a space");
            else if (sent.charAt(i) == (int) ' ')
                n++;
        }
        System.out.println("Number Of words in the given sentence: " + n);
    }
    public static void totNumberOfChar(){
        int s =0;
        int n=0;
        System.out.print("Enter the string: ");
        Scanner input = new Scanner(System.in);
        String sent = input.nextLine();
        for (int i = 0; i < sent.length(); i++) {
            if (sent.charAt(i)==(int)' ')
                s++;
            else
                n++;
        }
        System.out.println("Number Of chars in the given sentence: " + n);
    }
    public static void totNumberOfDigits(){
        int n=0;
        System.out.print("Enter the string: ");
        Scanner input = new Scanner(System.in);
        String sent = input.nextLine();
        for (int i = 0; i < sent.length(); i++) {
            for (int j = 0; j <= 9; j++) {
                if (sent.charAt(i) == 'j')
                    n++;
            }
        }
        System.out.println("Number Of digits in the given sentence: " + n);
    }
    public static void main(String[] args) {
        //numberOfWords();
        //totNumberOfChar();
        totNumberOfDigits();

    }
}

