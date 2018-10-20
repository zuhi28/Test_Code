package training.Java_Training.Assignment4;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        int a = 371;
        armNumberCheck(a);
    }

    private static void armNumberCheck(int n) {
        int a=n%10;
        int b=(n/10)%10;
        int c=(n/100)%10;;
        System.out.println(a +""+ b+ "" +c);
        int r= a*a*a +b*b*b+ c*c*c;
        if (n==r)
            System.out.println("Yes the given number is armstrong number");
        else
            System.out.println("No, its not!");

    }
}
