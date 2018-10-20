package training.Java_Training.Assignment_Day2_Sept7;

import java.util.Scanner;

public class AreaOFCircleTriangle_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter radius,base and height in order: ");
        float r=input.nextInt();
        float b =input.nextInt();
        float h = input.nextInt();
        float circleArea=areaOfAnyShape(r);
        float triangleArea=areaOfAnyShape(b,h);
        System.out.println("Area of the circle is: "+ (String.format("%1.1f" , circleArea)));
        System.out.println("Area Of triangle is: "+String.format("%.2f" ,triangleArea));
    }

    private static float areaOfAnyShape(float r) {
        float area = (22*r*r)/7;
        return area;

    }
    private static float areaOfAnyShape(float b, float h) {
        float area = (b*h)/2;
        return area;

    }
}
