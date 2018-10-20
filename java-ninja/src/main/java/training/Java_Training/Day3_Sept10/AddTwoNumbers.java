package training.Java_Training.Day3_Sept10;

import java.util.Scanner;

public class AddTwoNumbers {
    public static int addTwoNumbers(int x,int y){
        int sum = x+y;
        return sum;
    }
    public static int addTwoNumbers(int x,int y,int z){
        int sum = x+y+z;
        return sum;
    }
        public static void main(String[] args) {
            System.out.print("Enter how many numbers you want to added: ");
            Scanner userInput = new Scanner(System.in);
            int key= userInput.nextInt();
            switch (key){
                case 2:
                    System.out.print("Enter the numbers you want to get added: ");
                    int a1= userInput.nextInt();
                    int b1= userInput.nextInt();
                    System.out.println("Summation is: " + addTwoNumbers(a1,b1));
                    break;
                case 3:
                    System.out.print("Enter the numbers you want to get added: ");
                    int a2= userInput.nextInt();
                    int b2= userInput.nextInt();
                    int c2= userInput.nextInt();
                    System.out.println("Summation is: " + addTwoNumbers(a2,b2,c2));

            }
    }
}
