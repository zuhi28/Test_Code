package training.Java_Training.Test1_Sep13;

import java.util.Scanner;

public class RemoveDuplicateCharInString {
    public static void main(String[] args){
        System.out.print("Enter the string: ");
        Scanner input = new Scanner(System.in);
        String sent = input.nextLine();
        for (int i =0; i<=sent.length(); i++){
            for (int j=1; j<=sent.length(); j++){
                if (sent.charAt(i)==sent.charAt(j))
                    sent.replace(sent.charAt(j), ' ');
            }
        }
    }
}
