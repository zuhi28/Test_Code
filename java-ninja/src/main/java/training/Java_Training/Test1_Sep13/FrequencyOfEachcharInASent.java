package training.Java_Training.Test1_Sep13;

import java.util.Scanner;

public class FrequencyOfEachcharInASent {
    public static void main(String[] args) {
        int n =0;
        System.out.print("Enter the string: ");
        Scanner input = new Scanner(System.in);
        String sent = input.nextLine();
        for (int i =0; i< sent.length(); i++) {
            int k = 0;
            if ((int)sent.charAt(i) == (int) ' ')
                n++;
            else {
            for (int j = 0; j < sent.length(); j++) {
                if (sent.charAt(i) == sent.charAt(j)) {
                    k++;

                }

            }
                System.out.println(sent.charAt(i) + " is present for " + k + " times.");

            }
        }
        }
    }
