package training.Java_Training.Day4_Sept11;
import java.util.Scanner;

public class StringTest {
    public static void posOfAChar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input1 = input.nextLine();
        System.out.println("Enter the char whose position to be determined: ");
        String input2 = input.nextLine();
        System.out.println("Pos OF " + input2+ " is: " + input1.indexOf(input1));
    }
    public static void replaceACharByAnother(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input1 = input.nextLine();
        System.out.println("Enter the char which need to be replaced: ");
        String input2 = input.nextLine();
        System.out.println("Enter the char which need to be placed: ");
        String input3 = input.nextLine();
        System.out.println("Replaced string is: " + input1.replace(input2,input3));
    }
    public static void main(String[] args){
        //posOfAChar();
        replaceACharByAnother();

    }
}
