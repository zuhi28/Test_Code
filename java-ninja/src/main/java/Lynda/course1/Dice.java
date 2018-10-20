package Lynda.course1;
import java.util.Random;
import java.util.Scanner;

public class Dice {
    String colour;
    public Dice(String colour){
        this.colour=colour;
    }

    public void diceRollProb(){
        Random rand=new Random();
        int random=1+rand.nextInt(6);//correct it
        switch(random){
            case 1:
                System.out.println("Its 1");
                break;
            case 2:
                System.out.println("Its 2");
                break;
            case 3:
                System.out.println("Its 3");
                break;
            case 4:
                System.out.println("Its 4");
                break;
            case 5:
                System.out.println("Its 5");
                break;
            case 6:
                System.out.println("Its 6!!!!");
                break;
                default:
                    System.out.println("Invalid output");
        }


    }
    public void diceRoll(){
        Scanner usersInput = new Scanner(System.in);
        System.out.println("Roll the dice:");
        String input=usersInput.nextLine();
        diceRollProb();
    }

    public static void main(String[] args){
        Dice firstDice=new Dice("Blue");
        Dice secondDice=new Dice("Red");
        firstDice.diceRoll();
        secondDice.diceRoll();

    }
}
