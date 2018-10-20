package training.Java_Training.Assignment_Day1_Sept6;

import java.util.Scanner;

public class PrintingPattern {
    public static void pattern1(){
        int k=1;
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
    public static void pattern2(){
        int k = 1;
        for (int i=1; i<=4; i++){
            for (int j=1; j<=i; j++) {
                System.out.print((k*k +2) + " ");
                k++;
            }
            System.out.println();
        }
    }
    public static void pattern3() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
    public static void pattern4() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");

            }
            System.out.println();
        }
        for (int i = 3; i >=1; i--) {
            for (int j =1; j <=i; j++) {
                System.out.print("*" + " ");

            }
            System.out.println();
        }
    }
    public static void pattern5() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of row you want to print: ");
        int rows = input.nextInt();
        int row = rows/2;
        for (int i =1; i<=row; i++){
            for (int j=1; j<=row-i; j++ ) {
                System.out.print(" ");
            }
                for (int k =1; k<= 2*i -1; k++){
                    System.out.print("*");
            }
            System.out.println();
            }
        for (int i =row-1; i>=1; i--){
            for (int j=1; j<=row-i; j++ ) {
                System.out.print(" ");
            }
            for (int k =1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    public static void main(String[] args){
        //pattern1();
        pattern2();
        //pattern3();
        //pattern4();
        //pattern5();

    }
}
